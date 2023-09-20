package pack1;
import java.util.Scanner;
public class arrays2 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your rows:");
		int a=input.nextInt();
		System.out.print("Enter your columns:");
		int b=input.nextInt();
		int matrix[][]=new int[a][b];
		int matrix1[][]=new int[a][b];
		System.out.println("Enter your Array Elements:");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				 matrix[i][j]=input.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter your second matrix Elements:");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				matrix1[i][j]=input.nextInt();
			}
			System.out.println();
		}
		System.out.println("Elements of TWo matrix:");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(matrix[i][j]+matrix[i][j]+"\t");
				
			}
			
			System.out.println();
		}
	}

}
