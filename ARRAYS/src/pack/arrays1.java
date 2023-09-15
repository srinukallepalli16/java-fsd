package pack;
import java.util.Scanner;
   public class arrays1 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your rows:");
		int a=input.nextInt();
		int matrix[]=new int[a];
		for(int j=0;j<a;j++) {
		matrix[j]=input.nextInt();	
		}
		
		srinu(matrix);
	}
	public static void srinu( int array[]) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println("Sum of Array elements:"+sum);
	}
	
}
