package com.pack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

       
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        System.out.println("Queue after insertion: " + queue);

        
        String removedElement = queue.poll(); 
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

     
        String peekedElement = queue.peek();
        System.out.println("Peeked element: " + peekedElement);
        System.out.println("Queue after peeking: " + queue);
    }

}