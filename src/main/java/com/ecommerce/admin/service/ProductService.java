package com.ecommerce.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.admin.constants.NetworkConstant;
import com.ecommerce.admin.constants.URLConstants;
import com.ecommerce.admin.models.LoginReq;
import com.ecommerce.admin.models.LoginRes;
import com.ecommerce.admin.models.products.ProductRes;
import com.ecommerce.admin.utils.GsonHelper;
import com.ecommerce.admin.utils.NetworkHelper;


@Service
public class ProductService {
	
	@Autowired NetworkHelper networkHelper;
	@Autowired GsonHelper gsonHelper;
	
	
	public ProductRes getProductsList(int pageNo, int pageSize, String sortBy, String sortDir) {
		

		//APIResponse apiResponse = (APIResponse) new ApiResModel();
		//String requestBody = gsonHelper.toJson(loginReq);
		System.out.println("PageSize="+pageSize);
		String productURL= URLConstants.PRODUCTS+"?pageNo="+pageNo+"&pageSize="+pageSize;
		if( sortBy!=null && !sortBy.equals(""))
		{
			productURL=productURL+"&sortBy="+sortBy;
		}
		if( sortDir!=null && !sortDir.equals(""))
		{
			productURL=productURL+"&sortDir="+sortDir;
		}
		
		String res= networkHelper.callAPIRequest(NetworkConstant.GET_METHOD,productURL, null,null);
		//String res= networkHelper.sendGetRequest(URLConstants.PRODUCTS);
		ProductRes productRes = gsonHelper.fromJson(res, ProductRes.class);


		return productRes;
		
	}

}