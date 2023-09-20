package method1;
import method2.mango;
import java.util.Scanner;
public class apple1 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Using Methods:");
		System.out.println();
		System.out.println("Please Enter Your Name:");
		String s=input.nextLine();
		System.out.println("Please Enter your age:");
		int age=input.nextInt();
		System.out.println("Enter your number:");
		int a=input.nextInt();
		mango object=new mango();
		object.srinu(s);
		object.age(age);
		object.prime(a);
		
		
		
	}

}
