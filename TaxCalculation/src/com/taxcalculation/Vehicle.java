package com.taxcalculation;
class Vehicle{
	    private String RegNumber;
	    private String brand;
	    private double Cost;
	    private double Velocity;
	    private int capacity;
	    private int vehicleChoice;
	    public Vehicle(String RegNumber, String brand, double Cost, double Velocity, int capacity, int vehicleChoice) {
	        this.RegNumber =RegNumber;
	        this.brand = brand;
	        this.Cost = Cost;
	        this.Velocity = Velocity;
	        this.capacity = capacity;
	        this.vehicleChoice = vehicleChoice;
	      
	    }
	    public String getRegistrationNumber() {
			return RegNumber;
		}
		public void setRegistrationNumber(String registrationNumber) {
			this.RegNumber = RegNumber;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getPurchaseCost() {
			return Cost;
		}
		public void setPurchaseCost(double purchaseCost) {
			this.Cost = purchaseCost;
		}
		public double getMaxVelocity() {
			return Velocity;
		}
		public void setMaxVelocity(double maxVelocity) {
			this.Velocity = maxVelocity;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public int getVehicleChoice() {
			return vehicleChoice;
		}
		public void setVehicleChoice(int vehicleChoice) {
			this.vehicleChoice = vehicleChoice;
		}
		public double calculateVehicleTax() {
	        double tax = 0;
	        switch (vehicleChoice) {
	            case 1:
	                tax = Velocity + capacity + (0.1 * Cost);
	                break;
	            case 2:
	                tax = Velocity + capacity + (0.11 *Cost);
	                break;
	            case 3:
	                tax = Velocity + capacity + (0.12 * Cost);
	                break;
	        }
	        System.out.println("===========================================================================================================");
            System.out.printf("%5s  %10s  %10s  %8s  %20s" , "registrationNumber ", "brand ", " purchaseCost" ,"maxVelocity","capacity");
            System.out.println();
            System.out.println();
            System.out.format("%5s %23s %16s %9s %18s",RegNumber,brand,Cost,Velocity,capacity);
            System.out.println("\n==========================================================================================================");
	        return tax;
	    }
	    public String toString() {
	        return "Registration Number: " + RegNumber + "\nBrand: " + brand + "\nPurchase Cost: " + Cost +
	                "\nMax Velocity: " + Velocity + "\nCapacity: " + capacity + "\nVehicle Type: " + vehicleChoice ;
	   


	}
	}
