package com.example.myapplication.models;

public class HomeVerModel {
    int image ;
    String name;
    String timing;
    String price;

    public HomeVerModel(int image , String name , String  timing , String price ){
        this.image = image;
        this.name = name;
        this.timing = timing;
        this.price = price;

    }
    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public String getTiming(){
        return timing;
    }
    public String getPrice(){
        return price;
    }
}
