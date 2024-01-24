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

import com.ecommerce.admin.constants.AppConstants;
import com.ecommerce.admin.constants.NetworkConstant;
import com.ecommerce.admin.models.LoginReq;
import com.ecommerce.admin.models.LoginRes;
import com.ecommerce.admin.models.products.ProductRes;
import com.ecommerce.admin.service.ProductService;
import com.ecommerce.admin.service.UserService;
import com.ecommerce.admin.utils.CommonSharedSingleton;


@Controller
public class ProductController {
	
	@Autowired ProductService productService;

	
    
 /*   @GetMapping("/products" )
    public String products(  ModelMap model ){
    	
//    	if (result.hasErrors()) {
//            return "error";
//        }
    	
    	ProductRes productRes = productService.getProductsList();
    	System.out.println("ProductList = "+productRes.getProducts());
    	model.addAttribute("products",productRes.getProducts());
        return "products";
    }*/
    
    
	@GetMapping("/products")
    public String getAllproducts(
            @RequestParam(name = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(name = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(name = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(name = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false) String sortDir, 
            ModelMap model
    ){
		
		System.out.println("page Number "+pageSize);
		ProductRes productRes= productService.getProductsList(pageNo, pageSize, sortBy, sortDir);
        
      //  ProductRes productRes = productService.getProductsList();
    	System.out.println("ProductList = "+productRes.getProducts());
    	model.addAttribute("products",productRes.getProducts());
    	model.addAttribute("productRes",productRes);
        return "products";
    }
    
    
  
    
}