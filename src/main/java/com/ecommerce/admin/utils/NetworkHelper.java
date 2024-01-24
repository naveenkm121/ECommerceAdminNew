package com.ecommerce.admin.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.ecommerce.admin.constants.AppConstants;
import com.ecommerce.admin.constants.NetworkConstant;


@Component
public class NetworkHelper {
	
	

	// HTTP Post request
	 public  String sendingPostRequest(String url,String requestBody) {
		 	

		 	  URL obj;
		 	  HttpURLConnection conn;
		      StringBuffer response = new StringBuffer();	      
		      
		      try{
		    	  
		    	  obj = new URL(url);
		    	  conn = (HttpURLConnection) obj.openConnection();
		    	  conn.setRequestMethod("POST");
		    	  conn.setRequestProperty("Content-Type","application/json");
		    	 // conn.setRequestProperty("Authorization", "Basic "+base64Credentials);
			  // Send post request
		    	  conn.setDoOutput(true);
				  DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
				  wr.writeBytes(requestBody);
				  wr.flush();
				  wr.close();
			 
				  int responseCode = conn.getResponseCode();
				 /* System.out.println("===========================XXX=============== API Request =================XXX================ ");
				  System.out.println("Request URL : " + url);
				  System.out.println("Request Data : " + requestBody);
				  System.out.println("Response Code : " + responseCode);*/
				  
				  BufferedReader in = new BufferedReader(
				          new InputStreamReader(conn.getInputStream()));
				  String output;
				
					while ((output = in.readLine()) != null) {
						   response.append(output);
					}
					in.close();
				 
		      }
		      catch (Exception e1) {
					//e1.printStackTrace();
					System.out.println(AppConstants.APP_NAME+": sendPostRequest():Exception while sending Request");
				}

			  //System.out.println("Response Data : "+response.toString());
			  return response.toString();
		 }
	 
		// HTTP Post request
	 public  String callAPIRequest(String method,String url,String requestBody,String token) {
		 	

		 	  URL obj;
		 	  HttpURLConnection conn;
		      StringBuffer response = new StringBuffer();	      
		      
		      try{
		    	  
		    	  obj = new URL(url);
		    	  conn = (HttpURLConnection) obj.openConnection();
		    	  conn.setRequestMethod(method);
		    	  conn.setRequestProperty("Content-Type","application/json");
		    	  if(token!=null && token.equals("")){
		    			 conn.setRequestProperty(NetworkConstant.AUTHORIZATION, "Bearer "+token);
		    	  }
		    	  conn.setDoOutput(true);
		    	  System.out.println("============================ API Request ========================= ");
				  System.out.println("Request URL : " + url);
				  System.out.println("Request Data : " + requestBody);
				  
				  if(requestBody!=null && requestBody.equals("")){
					  DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
					  wr.writeBytes(requestBody);
					  wr.flush();
					  wr.close();
				  }
			 
				  int responseCode = conn.getResponseCode();
				  System.out.println("Response Code : " + responseCode);
				  BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				  String output;
				
					while ((output = in.readLine()) != null) {
						   response.append(output);
					}
					in.close();
				 
		      }
		      catch (Exception e1) {
					e1.printStackTrace();
					System.out.println(AppConstants.APP_NAME+": sendPostRequest():Exception while sending Request");
				}
			  ;
			  System.out.println("Response Data : "+response.toString());
			  return response.toString();
		 }
	 
	 
	 
	// HTTP Post request
		 public  String sendGetRequest(String url) {
			 	

			 	  URL obj;
			 	  HttpURLConnection conn;
			      StringBuffer response = new StringBuffer();			      
			      
			      try{
			    	  
			    	  obj = new URL(url);
			    	  conn = (HttpURLConnection) obj.openConnection();
			    	  conn.setRequestMethod("GET");
			    	  conn.setRequestProperty("Content-Type","application/json");
			    	 // conn.setRequestProperty("Authorization", "Basic "+base64Credentials);
				  // Send post request
			    	  /*conn.setDoOutput(true);
					  DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
					  wr.writeBytes(requestBody);
					  wr.flush();
					  wr.close();*/
				 
					  int responseCode = conn.getResponseCode();
					 /* System.out.println("===========================XXX=============== API Request =================XXX================ ");
					  System.out.println("Request URL : " + url);
					 // System.out.println("Request Data : " + requestBody);
					  System.out.println("Response Code : " + responseCode);*/
					  
					  BufferedReader in = new BufferedReader(
					          new InputStreamReader(conn.getInputStream()));
					  String output;
					
						while ((output = in.readLine()) != null) {
							   response.append(output);
						}
						in.close();
					 
			      }
			      catch (Exception e1) {
						//e1.printStackTrace();
						System.out.println(AppConstants.APP_NAME+": sendGetRequest():Exception while sending Request");
					}

				  //System.out.println("Response Data : "+response.toString());
				  return response.toString();
			 }

		

}
