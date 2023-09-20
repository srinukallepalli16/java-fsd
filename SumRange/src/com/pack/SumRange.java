package com.pack;
import java.util.Scanner;
public class SumRange {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        
        int[] arr = new int[n];
        
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        
        System.out.print("Enter the left index (L): ");
        int L = scanner.nextInt();
        System.out.print("Enter the right index (R): ");
        int R = scanner.nextInt();
        
       
        if (L < 0 || R >= n || L > R) {
            System.out.println("Invalid range.");
            return;
        }
        
        
        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }
        
      
        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);
    }

}
