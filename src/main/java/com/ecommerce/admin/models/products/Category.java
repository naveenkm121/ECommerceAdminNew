package com.ecommerce.admin.models.products;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Category {

   @SerializedName("id")
   int id;

   @SerializedName("name")
   String name;

   @SerializedName("subCategories")
   List<String> subCategories;


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setSubCategories(List<String> subCategories) {
        this.subCategories = subCategories;
    }
    public List<String> getSubCategories() {
        return subCategories;
    }
    
}