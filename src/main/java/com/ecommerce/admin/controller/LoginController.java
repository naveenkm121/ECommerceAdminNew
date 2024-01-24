package com.ecommerce.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.admin.constants.NetworkConstant;
import com.ecommerce.admin.models.LoginReq;
import com.ecommerce.admin.models.LoginRes;
import com.ecommerce.admin.service.UserService;
import com.ecommerce.admin.utils.CommonSharedSingleton;


@Controller
public class LoginController {
	
	@Autowired UserService userService;

	
    @GetMapping({  "/","/login" })
    public String login() {
        return "login";
    }
    
    
    @GetMapping("/welcome" )
    public String welcome(@RequestParam(value = "name",defaultValue = "World", required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }
    
    @GetMapping("/home" )
    public String home( ){
        return "home";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String submit(@ModelAttribute("loginReq")LoginReq loginReq,  BindingResult result, ModelMap model) {
        
    	if (result.hasErrors()) {
            return "error";
        }
    	
    	CommonSharedSingleton commonSharedSingleton = CommonSharedSingleton.getInstance();
    	LoginRes loginRes =  userService.getLoginData(loginReq);
    	
    	if(loginRes.status==NetworkConstant.STATUS_SUCCESS)
    	{
    		commonSharedSingleton.token=loginRes.token;
    		commonSharedSingleton.userData= loginRes.data;
    		model.addAttribute("user",loginReq.username);
    		return "home";
    	}else{
    		model.addAttribute("error",loginRes.message);
    		return "login";
    	}
    	
    }
    
}
