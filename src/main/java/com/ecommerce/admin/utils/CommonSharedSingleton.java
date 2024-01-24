package com.ecommerce.admin.utils;

import com.ecommerce.admin.models.LoginRes;
import com.ecommerce.admin.models.UserData;

public class CommonSharedSingleton {
	
    private static CommonSharedSingleton single_instance = null;
    
    public String token;
    public UserData userData;

    private CommonSharedSingleton()
    {
    	token="";
    	userData= new UserData();
       
    }

    public static CommonSharedSingleton getInstance()
    {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new CommonSharedSingleton();
        }
        return single_instance;
    }

}
