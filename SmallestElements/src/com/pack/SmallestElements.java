package com.pack;

import java.util.Arrays;

public class SmallestElements {
	public static void main(String[] args) {
        int[] arr = {12, 45, 1, 78, 56, 34, 90, 23};
        int fourthSmallest = findFourthSmallest(arr);
        System.out.println("The fourth smallest element is: " + fourthSmallest);
    }

    public static int findFourthSmallest(int[] arr) {
        if (arr.length < 4) {
           
            System.out.println("The list has less than 4 elements.");
            return -1;
        }
        
        Arrays.sort(arr); 
        return arr[3]; 
    }

}
