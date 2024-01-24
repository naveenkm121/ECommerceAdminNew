package com.ecommerce.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.admin.constants.NetworkConstant;
import com.ecommerce.admin.constants.URLConstants;
import com.ecommerce.admin.models.LoginReq;
import com.ecommerce.admin.models.LoginRes;
import com.ecommerce.admin.utils.GsonHelper;
import com.ecommerce.admin.utils.NetworkHelper;


@Service
public class UserService {
	
	@Autowired NetworkHelper networkHelper;
	@Autowired GsonHelper gsonHelper;
	
	
	public LoginRes getLoginData(LoginReq loginReq) {
		

		//APIResponse apiResponse = (APIResponse) new ApiResModel();
		String requestBody = gsonHelper.toJson(loginReq);
		String res= networkHelper.callAPIRequest(NetworkConstant.POST_METHOD, URLConstants.LOGIN, requestBody, null);
		LoginRes loginRes = gsonHelper.fromJson(res, LoginRes.class);
		/*mdrtList = gsonHelper.getList(res,MDRTModel.class );
		if(!mdrtList.isEmpty())
		{
			apiResponse.setStatus(1);
			apiResponse.setMessage("success");
			apiResponse.setData(mdrtList);
		}else{
			apiResponse.setStatus(0);3265 hh
			apiResponse.setMessage("failure");
			apiResponse.setData(mdrtList);
		}
	*/

		return loginRes;
		
	}

}
