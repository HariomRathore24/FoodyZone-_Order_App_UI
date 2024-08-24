package com.example.myapplication.models;

public class CartModel {

    int image;
    String name;
    String price;
    String rating;
    String description;

    public CartModel(int image, String name ,String price, String rating , String description){
        this.name =name;
        this.image= image;
        this.price = price;
        this.rating =rating;
        this.description = description;

    }
    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image = image;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public String getRating(){
        return rating;
    }
    public void setRating(String rating){
        this.rating =rating;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description =description;
    }

}

