package com.ecommerce.admin.models.products;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Product {

   @SerializedName("id")
   int id;

   @SerializedName("title")
   String title;

   @SerializedName("description")
   String description;

   @SerializedName("price")
   int price;

   @SerializedName("discountPercentage")
   double discountPercentage;

   @SerializedName("rating")
   double rating;

   @SerializedName("stock")
   int stock;

   @SerializedName("category")
   Category category;

   @SerializedName("brand")
   String brand;

   @SerializedName("thumbnail")
   String thumbnail;

   @SerializedName("images")
   List<Images> images;


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public Category getCategory() {
        return category;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getThumbnail() {
        return thumbnail;
    }
    
    public void setImages(List<Images> images) {
        this.images = images;
    }
    public List<Images> getImages() {
        return images;
    }
    
}