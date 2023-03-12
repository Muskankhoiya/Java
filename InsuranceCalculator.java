package com.nagarro.demo;

public class InsuranceCalculator {
             public double calculatePremium(Car car) {
            	 double premium;
            	 switch (car.getType().toLowerCase()) {
            	 case "hatchback":
            		 premium = car.getPrice() * 0.05;
            		 break;
            	 case "sedan":
            		 premium=car.getPrice() * 0.08;
            		 break;
            	 case "suv":
            		 premium = car.getPrice() * 0.1;
            		 break;
                 default:
                	 throw new IllegalArgumentException("invalid car type");
            	 }
            	 
            	 if(car.getInsuranceType().equalsIgnoreCase("premium")) {
            		 premium += premium *0.2;
            	 }
            	 
            	 return premium;
             }
}
