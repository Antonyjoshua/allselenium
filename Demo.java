package com.pratice;

public class Demo {
	    // Fields or attributes
	    String make;
	    String model;
	    int year;

	    // Constructor
	    public Demo(String make, String model, int year) {
	        // Initializing the object's attributes
	        this.make = make; 
	        this.model = model;
	        this.year = year;
	    }

	    // Other methods can be defined here
	    public void displayInfo() {
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }

	    public static void main(String[] args) {
	        // Creating an instance of the Car class using the constructor
	        Demo myCar = new Demo("Toyota", "Camry", 2022);

	        // Calling a method to display information about the car
	        myCar.displayInfo();
	    }
	}

	
