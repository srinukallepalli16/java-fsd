package com.pack;

	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	class LinkedList {
	    Node head;

	    void deleteFirstOccurrence(int key) {
	        if (head == null) {
	            return;
	        }

	        
	        if (head.data == key) {
	            head = head.next;
	            return;
	        }

	        Node prev = null;
	        Node current = head;

	        while (current != null && current.data != key) {
	            prev = current;
	            current = current.next;
	        }

	        if (current == null) {
	            
	            return;
	        }

	        
	        prev.next = current.next;
	    }

	    void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	    }

	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.head = new Node(1);
	        list.head.next = new Node(2);
	        list.head.next.next = new Node(3);
	        list.head.next.next.next = new Node(4);

	        System.out.println("Original Linked List:");
	        list.display();

	        int keyToDelete = 3;
	        list.deleteFirstOccurrence(keyToDelete);

	        System.out.println("\nLinked List after deleting first occurrence of " + keyToDelete + ":");
	        list.display();
	    }
	}


