package com.taxcalculation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class TaxCalculation{
	private static final String String = null;

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to the Tax caluculation Application");
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        apple object=new apple();
        object.frontdesk(username, password);
        if(object.login()) {
        System.out.println("Login Succesfully:");       
        List<Property> properties = new ArrayList<>();
	    List<Vehicle> vehicles = new ArrayList<>();
	    while(true) {
	        	System.out.println("Tax calculation Application:");
	        	System.out.println("1.Property");
	        	System.out.println("2.Vehicle");
	        	System.out.println("3.View and Calculate Total Taxes");
	        	System.out.println("4.Exit");
	        	System.out.println("Enter your choice:");
	        	int mainchoice=input.nextInt();
	        	input.nextLine();
	        	 switch (mainchoice) {
	                case 1:
	                    while (true) {
	                        System.out.println("\nProperty Menu:");
	                        System.out.println("1. Add Property Details");
	                        System.out.println("2. Calculate Property Tax");
	                        System.out.println("3. Display All Properties");
	                        System.out.println("4. Back to Main Menu");
	                        System.out.print("Enter your choice: ");
	                        int propertyChoice = input.nextInt();
	                        input.nextLine(); 
	                        double BaseValueOfLand  ;
	                        String IsInCityInput ;
	                        int AgeOfConstruction;
	                        double BuiltUpArea ;
	                        switch (propertyChoice) {
	                            case 1:
	                                System.out.print("Enter Value of Land: ");
	                                BaseValueOfLand = input.nextDouble();
	                                System.out.print("Is in City (yes/no): ");
	                                IsInCityInput = input.next();
	                                boolean IsInCity = IsInCityInput.equals("Y") || IsInCityInput.equals("y");
	                                System.out.print("Enter Age of Construction: ");
	                                AgeOfConstruction = input.nextInt();
	                                System.out.print("Enter Property - Area: ");
	                                BuiltUpArea = input.nextDouble();
                                    Property property = new Property(BaseValueOfLand, IsInCity, AgeOfConstruction, BuiltUpArea);
	                                properties.add(property);
	                                System.out.println("Property added successfully!");
	                                System.out.println("=======================================================================");
	                                System.out.printf("%5s  %10s  %10s  %8s" , "BasevalueOfLand ", " IsInCityInput", "  AgeOfConstruction","  BuiltUpArea");
	                                System.out.println();
	                                System.out.println();
	                                System.out.format("%7s %14s %15s %25s ",BaseValueOfLand,IsInCityInput,AgeOfConstruction,BuiltUpArea);
	                                System.out.println("\n========================================================================");
	                                break;
	                               

	                            case 2:
	                            	System.out.println("\nProperty Taxes Calculator:");
	                            	System.out.println("============================================================================");
	                            	for (Property prop : properties) {
	                                    System.out.println(prop);
	                                    System.out.println("Property Tax: " + prop.calculatePropertyTax());
	                                    System.out.println("======================================================================================");
	                                    
	                                    }
	                                
	                                break;
	                                
	                            case 3:
	                            	System.out.println("\nProperty Details and Taxes:");
	                                System.out.println("==========================================================================================");
	        	                    for (Property prop : properties) {
	        	                        System.out.println(prop);
	        	                        System.out.println("Property Tax: " + prop.calculatePropertyTax());
	        	                        System.out.println("=======================================================================================");
	        	                        System.out.println();
	        	                    }
	                                break;
	                            case 4:
	                            	 break;
	                            	
	                            default:
	                                System.out.println("Invalid choice. Please try again.");
	                        }
                          
	                        if (propertyChoice == 4) {
    	                         break; 
    	                        }
	                        
	                    }
	                   
	                   break;

	                case 2:
	                    
	                    while (true) {
	                        System.out.println("\nVehicle Menu:");
	                        System.out.println("1. Add Vehicle");
	                        System.out.println("2. Calculate Vehicle Tax");
	                        System.out.println("3.Display All vehicles");
	                        System.out.println("4. Back to Main Menu");
	                        System.out.print("Enter your choice: ");
	                        int vehicleChoice = input.nextInt();
	                        input.nextLine(); 

	                        switch (vehicleChoice) {
	                            case 1:
	                                System.out.print("Enter Registration Number: ");
	                                String registrationNumber = input.next();
	                                System.out.print("Enter Brand: ");
	                                String brand = input.next();
	                                System.out.print("Enter Purchase Cost: ");
	                                double purchaseCost = input.nextDouble();
	                                System.out.print("Enter Max Velocity: ");
	                                double maxVelocity = input.nextDouble();
	                                System.out.print("Enter Capacity: ");
	                                int capacity = input.nextInt();

	                                Vehicle vehicle = new Vehicle(registrationNumber, brand, purchaseCost, maxVelocity, capacity, vehicleChoice);
	                                vehicles.add(vehicle);
	                                System.out.println("Vehicle added successfully!");
	                                System.out.println("===========================================================================================================");
	                                System.out.printf("%5s  %10s  %10s  %8s  %20s" , "registrationNumber ", "brand ", " purchaseCost" ,"maxVelocity","capacity");
	                                System.out.println();
	                                System.out.println();
	                                System.out.format("%5s %23s %16s %9s %18s",registrationNumber,brand,purchaseCost,maxVelocity,capacity);
	                                System.out.println("\n==========================================================================================================");
	                                break;

	                            case 2:
	                                System.out.println("\nVehicle Details and Taxes:");
	                                System.out.println("===========================================================");
	        	                    for (Vehicle veh : vehicles) {
	        	                        System.out.println(veh);
	        	                        System.out.println("Vehicle Tax: " + veh.calculateVehicleTax());
	        	                        System.out.println("=======================================================");
	        	                        System.out.println();
	        	                    }
	                                break;
	                            case 3:
	                            	System.out.println("\nDisplay All Vehicles");
	                            	 System.out.println("===========================================================");
		        	                    for (Vehicle veh : vehicles) {
		        	                        System.out.println(veh);
		        	                        System.out.println("Vehicle Tax: " + veh.calculateVehicleTax());
		        	                        System.out.println("====================================================");
		        	                        System.out.println();
		        	                    }
	                            case 4:
	                            	break;

	                            default:
	                                System.out.println("Invalid choice. Please try again.");
	                        }

	                        if (vehicleChoice == 4) {
	                            break; 
	                        }
	                    }
	                    break;

	                case 3:
	                	
	                	System.out.println("\nTotal Property Tax and Vehicle Taxes:");
	                    /*for (Property prop1 : properties) {
	                        System.out.println(prop1);
	                        System.out.println("Property Tax: " + prop1.calculatePropertyTax());
	                        System.out.println();
	                    }

	                    System.out.println("\nVehicle Details and Taxes:");
	                    for (Vehicle veh : vehicles) {
	                        System.out.println(veh);
	                        System.out.println("Vehicle Tax: " + veh.calculateVehicleTax());
	                        System.out.println();
	                    }*/
	                    
	                    double totalPropertyTax = properties.stream().mapToDouble(Property::calculatePropertyTax).sum();
	                    double totalVehicleTax = vehicles.stream().mapToDouble(Vehicle::calculateVehicleTax).sum();
	                    double totalTax = totalPropertyTax + totalVehicleTax;
	                    System.out.println("======================================================");
	                    System.out.println("Property Tax:"+totalPropertyTax);
	                    System.out.println("Total Vehicle Tax:"+totalVehicleTax);
	                    System.out.println("Total Tax: $" + totalTax);
	                    System.out.println("======================================================");
	                    System.out.println("Property Tax \t TotalVehicleTax \t TotalTax");
	                    System.out.println();
	                    System.out.println(totalPropertyTax + " \t "+ totalVehicleTax+" \t "+ totalTax +"\t     ");
	                    System.out.println("=================================================");
	                    
	                    break;
	      
	             case 4:
	                    System.out.println("Exiting the application.");
	                    input.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	         	 }
	        	 
	       }
    }
         else {
        	System.out.println("Invalid Creditionals:");
        }
    
	}
}