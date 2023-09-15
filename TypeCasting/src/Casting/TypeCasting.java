package Casting;
import java.util.Scanner;
public class TypeCasting {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Implicity  Type Casting Int To Double:");
		
		System.out.println("Enter your Value:");
        
		int var=input.nextInt();
	    
		double dvar=var;
	    
		System.out.println("Int value "+ var);

        System.out.println("Double value"+ dvar);
        
        System.out.println();
        
        System.out.println("______Explicity Type Casting Double To Int_____");
        
        System.out.println();
        
        System.out.println("Enter your second number:");
        
        double vare=input.nextDouble();
        
        int variable=(int) vare;
        
        System.out.println("Double value: "+ vare);
        
        System.out.println("Int Value: "+ variable);

        
	}

}
