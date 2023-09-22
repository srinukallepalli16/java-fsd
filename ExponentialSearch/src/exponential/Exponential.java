package exponential;
import java.util.Arrays;
import java.util.Scanner;
	public class Exponential {
	 static int exponentialSearch(int arr[],int n, int x){
	    if (arr[0] == x)
	     return 0;
	     int i = 1;
	     while (i < n && arr[i] <= x)
	     i = i*2;
	     return Arrays.binarySearch(arr, i/2,Math.min(i, n-1), x);
	    }
	    public static void main(String args[]){
	    	Scanner input=new Scanner(System.in);
	    	System.out.println("Enter number Elements:");
	    	int a=input.nextInt();
	    	System.out.println("Enter your Elements:");
	        int arr[] = new int[a];
	        for(int i=0;i<a;i++) {
	        	arr[i]=input.nextInt();
	        }
	        System.out.println("Enter Key value:");
	        int x=input.nextInt(); 
	        int result = exponentialSearch(arr, arr.length, x);
	         System.out.println((result < 0) ?"Element is not present in array" :"Element is present at index: "+result);
	    }
	}


