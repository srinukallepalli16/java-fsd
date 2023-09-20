package pack;
  import pack1.access1;
  import java.util.Scanner;
  public class access {
	  public static void main(String args[]) {
		  Scanner input=new Scanner(System.in);
		  System.out.println("Using Access Modifiers:");
		  System.out.println();
		  System.out.println("Enter your first number:");
		  int a=input.nextInt();
		  System.out.println("Enter your second number:");
		  int b=input.nextInt();
		  System.out.println("Enter your third number:");
		  int c=input.nextInt();
		  access1 object=new access1();
		  object.modify(a, b, c);
		  System.out.println(object.getAccess());
	  }

}
