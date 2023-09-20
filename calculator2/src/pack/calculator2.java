package pack;
import java.util.Scanner;
public class calculator2 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Airthemetic Calculator:");
		System.out.println();
		System.out.println("Enter your First number:");
		int a=input.nextInt();
		System.out.println("Enter your Second Number:");
		int b=input.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Enter your operator:");
		int c=input.nextInt();
	    int result=0;
	    switch(c) {
	    case 1:
	    	System.out.println("Final Output is:"+(a+b));
	    	break;
	    case 2: 
	    	System.out.println("Final Output is:"+(a-b));
	    	break;
	    case 3:
	    	System.out.println("Final Output is:"+(a*b));
	    	break;
	    case 4:
	    	System.out.println("Final Output is:"+(a/b));
	    	break;
	    default:
	    	System.out.println("Syntax error");
	    	
	    }
	   
	}
}


