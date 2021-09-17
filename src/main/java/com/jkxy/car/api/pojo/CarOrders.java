package com.jkxy.car.api.pojo;

public class CarOrders {
    private int id;
    private String number;
    private double price;
    private String userid;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getUserid(){
        return userid;
    }

    public void setUserid(String userid){
        this.userid =userid;
    }
}
