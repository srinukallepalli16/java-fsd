package pack;
import java.util.Scanner;
import java.util.Scanner;
class MultiplicationMatrix {
    public static void main(String args[]) {
    	Scanner input=new Scanner(System.in);
    	System.out.println("enter your rows:");
    	int a=input.nextInt();
    	System.out.println("enter your columns:");
    	int b=input.nextInt();
    	System.out.println("enter your first matrix elements:");
        int matrix[][]=new int[a][b];
        int matrix2[][]=new int[a][b];
        for(int i=0;i<a;i++) {
        	for(int j=0;j<b;j++) {
        		matrix[i][j]=input.nextInt();	
        	}
        	System.out.println();
        }
        System.out.println("enter your second matrix elements:");
        for(int i=0;i<b;i++) {
        	for(int j=0;j<b;j++) {
        		matrix2[i][j]=input.nextInt();
        	}
        	System.out.println();
        }
        System.out.println("......matrix mulitplication......");
        for(int i=0;i<a;i++) {
        
        	for(int j=0;j<b;j++) {
        		System.out.printf("%d \t",matrix[i][j]+matrix[i][j]);
        		
        	}
        	System.out.println();
        }
    }
}
