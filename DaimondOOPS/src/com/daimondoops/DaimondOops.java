package com.daimondoops;
import java.util.Scanner;
interface student{
	public default void srinu1(String s,int a) {
		System.out.println("Student name is:"+s);
		System.out.println("Student Age is:"+a);	
	}
	interface employee{
		public default void emp(String s,int a){
			
			System.out.println("Employee name is:"+s);
			System.out.println("Employee Age is:"+a);	
		}
	}
	public class Both implements student,employee{
		public void dispaly(String s,int a) {
			
			student.super.srinu1(s, a);
			employee.super.emp(s, a);
		}
	}
	
}
class DaimondOops{
	public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Student Name:");
	String s=input.nextLine();
	System.out.println("Enter Student Age:");
	int a=input.nextInt();
	student.Both object=new student.Both();
	object.srinu1(s, a);
     object.emp(s, a);
	}
}