package com.nagarro.demo;

public class Car {
    private String model;
    private String type;
    private double price;
    private String insuranceType;
    
    public String getModel() {
    	return model;
    }
    
    public void setModel(String model) {
    	this.model= model;
    }
    
    public void setType(String type) {
    	this.type=type;
    }
    
    public void setPrice(double price) {
    	this.price=price;
    }
    
    public String getType() {
    	return type;
    }
    
    public double getPrice() {
    	return price;
    }
    
    public String getInsuranceType() {
    	return insuranceType;
    }
    
    public void setInsuranceType(String insuranceType) {
    	this.insuranceType= insuranceType;
    }
}
