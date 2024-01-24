package com.ecommerce.admin.models.products;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class ProductRes {

   @SerializedName("pageNo")
   int pageNo;

   @SerializedName("pageSize")
   int pageSize;

   @SerializedName("totalElements")
   int totalElements;

   @SerializedName("totalPages")
   int totalPages;

   @SerializedName("isLast")
   boolean isLast;

   @SerializedName("message")
   String message;

   @SerializedName("status")
   int status;

   @SerializedName("data")
   List<Product> products;


    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
    public int getPageNo() {
        return pageNo;
    }
    
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getPageSize() {
        return pageSize;
    }
    
    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }
    public int getTotalElements() {
        return totalElements;
    }
    
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
    public int getTotalPages() {
        return totalPages;
    }
    
    public void setIsLast(boolean isLast) {
        this.isLast = isLast;
    }
    public boolean getIsLast() {
        return isLast;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}
    

    
}