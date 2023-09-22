package quicksort;
import java.io.*;
import java.util.Scanner;
public class QuickSort {
	    static void swap(int[] arr, int i, int j){
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	    static int partition(int[] arr, int low, int high){
	       
	        int pivot = arr[high];
	        int i = (low - 1);
	 
	        for (int j = low; j <= high - 1; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, i + 1, high);
	        return (i + 1);
	    }
	    static void quickSort(int[] arr, int low, int high){
	        if (low < high) {
	            int pi = partition(arr, low, high);
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }
	    public static void printArr(int[] arr){
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    public static void main(String[] args){
	    	Scanner input=new Scanner(System.in);
	    	System.out.println("Enter your Array Length:");
	    	int a=input.nextInt();
	    	System.out.println("Enter your Array Elements:");
	        int arr[] = new int[a];
	        for(int i=0;i<a;i++) {
	        	arr[i]=input.nextInt();
	        }
	        int N = arr.length;
	        quickSort(arr, 0, N - 1);
	        System.out.println("Sorted array:");
	        printArr(arr);
	    }
	}

