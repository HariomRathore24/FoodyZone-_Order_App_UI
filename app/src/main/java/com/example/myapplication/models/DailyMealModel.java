package com.example.myapplication.models;

import android.content.Context;
import android.content.Intent;

public class DailyMealModel {

    int image;
    String name;
    String discount;
    String type;
    String description;


    public DailyMealModel(int image, String name ,String discount, String type ,String description){
        this.name =name;
        this.image= image;
        this.discount = discount;
        this.description = description;
        this.type =type;
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
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDiscount(){
        return discount;
    }
    public void setDiscount(String discount){
        this.discount = discount;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type =type;
    }
}
