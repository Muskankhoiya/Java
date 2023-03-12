package com.nagarro.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarInsurance {
     
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		String input;
		boolean addAnotherCar=true;
		
		while(addAnotherCar) {
		Car car = new Car();
		System.out.print("Enter car model: ");
		car.setModel(sc.nextLine());
		
		String carType="";
		while (!carType.equalsIgnoreCase("Hathback") && !carType.equalsIgnoreCase("Sedan") && !carType.equalsIgnoreCase("SUV")) { 
			System.out.print("Enter Car Type: (Hatchback/Sedan/SUV): ");
			carType=sc.nextLine();
			if (!carType.equalsIgnoreCase("Hathback") && !carType.equalsIgnoreCase("Sedan") && !carType.equalsIgnoreCase("SUV")) { 
				System.out.println("Invalid car type. Enter car type (Hatchback/Sedan/SUV)");
			}
			else {
				car.setType(carType);
			}
		}
		
		double price=0;
		
		while(price <=0) {
			try {
				System.out.print("Enter car price: ");
				price= sc.nextDouble();
				if (price <=0) {
					System.out.println("Invalid car price. Enter car price greater than zero ");
					
				}
				else {
					car.setPrice(price);
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid number. ");
				sc.nextLine();
			}
		}
		
		sc.nextLine();
		String insuranceType="";
		while (!insuranceType.equalsIgnoreCase("basic") && !insuranceType.equalsIgnoreCase("premium")) { 
			System.out.print("Enter insurance type (Basic/Premium): ");
			insuranceType=sc.nextLine();
			if (!insuranceType.equalsIgnoreCase("basic") && !insuranceType.equalsIgnoreCase("premium")) { 
				System.out.println("Invalid insurance type. Please enter Basic or Premium.");
			}
			else {
				car.setInsuranceType(insuranceType);
			}
		}
		
		InsuranceCalculator calculator = new InsuranceCalculator();
		double premium = calculator.calculatePremium(car);
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Details of the Car enter by User: ");
		System.out.println("--------------------------------------------");
		System.out.println("Car model: "+ car.getModel());
		System.out.println("Car modelype: "+ car.getType());
		System.out.println("Car price: "+ car.getPrice());
		System.out.println("Insurance type: "+ car.getInsuranceType());
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Car Total insurance premium: "+ premium);
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.print("Do you want to enter details of any other Car: (y/n): ");
		input = sc.nextLine();
		System.out.println();
		if(input.equalsIgnoreCase("n")) {
			addAnotherCar=false;
		}
		}
		
		sc.close();
		
	}
}
