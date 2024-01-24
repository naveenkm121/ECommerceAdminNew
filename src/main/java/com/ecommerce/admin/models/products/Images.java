package com.ecommerce.admin.models.products;

import com.google.gson.annotations.SerializedName;

   
public class Images {

   @SerializedName("id")
   int id;

   @SerializedName("src")
   String src;

   @SerializedName("prodId")
   int prodId;


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setSrc(String src) {
        this.src = src;
    }
    public String getSrc() {
        return src;
    }
    
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
    public int getProdId() {
        return prodId;
    }
    
}