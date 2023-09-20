package com.trycatch;
import java.util.Scanner;

public class TryCatch {
	

	

		public static void main(String[] args) {
	 
	        Scanner scanner = new Scanner(System.in);
	        
	        try 
	        {
	           
	            System.out.print("Enter a number: ");
	            int num = Integer.parseInt(scanner.nextLine());

	         
	            int result = 10 / num;

	                
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) 
	        {
	        	
	            
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (NumberFormatException e) 
	        {
	        	
	        
	            System.out.println("Error: Invalid input. Please enter a valid number.");
	        } finally 
	        {
	        	
	         
	            scanner.close();
	        }

		}

	}


