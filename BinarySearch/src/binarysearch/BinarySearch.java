package binarysearch;
import java.util.Scanner;
public class BinarySearch {
	public static void Search(int array[],int first,int last,int key) {
		int mid=(first+last)/2;
		 while( first <= last ){  
		      if ( array[mid] < key ){  
		        first = mid + 1;     
		      }else if ( array[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
	 }  
	public static void main(String args[]){  
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter Elements you want:");
		 int a=input.nextInt();
		 System.out.println("Enter Elements:");
	        int array[] = new int[a];
	        for(int i=0;i<a;i++) {
	        	array[i]=input.nextInt();
	        }
	        System.out.println("Enter Key value:");
	        int key = input.nextInt();
	        int last=array.length-1;  
	        Search(array,0,last,key);     
	 }  
	
}


