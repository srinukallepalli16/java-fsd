package com.pack;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("Enter Number of Elements you want ?");
		int a=input.nextInt();
		System.out.println("Enter your Elements:");
		int Array[]=new int[a];
		for(i=0;i<a;i++) {
			Array[i]=input.nextInt();
		}
		System.out.print("Enter your Key Element:");
		int key=input.nextInt();
		for( i=0;i<a;i++) {
			if(Array[i]==key) {
				System.out.println(key+" is present at the index value of  "+(i+1+"."));
				break;
			}
			
		}
		if(i==a) {
			System.out.println(key+"is not present in Array.");
		}
		
		
	}
	
   
}