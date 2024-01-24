package com.ecommerce.admin.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.List;


import org.springframework.core.io.ClassPathResource;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class CommonUtility {
	
	
	public static <T> List<T> getList(String json, Class<T> clazz) {
	    Type typeOfT = TypeToken.getParameterized(List.class, clazz).getType();
	    return new Gson().fromJson(json, typeOfT);
	}
	
	
	public static String readJsonFromFile(String fileName) throws IOException {
		File resource = new ClassPathResource(fileName).getFile();
		String resString = new String(Files.readAllBytes(resource.toPath()));
		
		return resString;
	}
	

}
