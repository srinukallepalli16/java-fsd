package com.pack;


	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class CircularLinkedList{
	    Node head;

	    public CircularLinkedList() {
	        head = null;
	    }

	    public void insertSorted(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            newNode.next = newNode;
	            head = newNode;
	        } else if (data <= head.data) {
	            newNode.next = head;
	            Node current = head;
	            while (current.next != head) {
	                current = current.next;
	            }
	            current.next = newNode;
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != head && current.next.data < data) {
	                current = current.next;
	            }
	            newNode.next = current.next;
	            current.next = newNode;
	        }
	    }

	    public void display() {
	        if (head == null) {
	            System.out.println("Circular Linked List is empty.");
	            return;
	        }

	        Node current = head;
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != head);
	    }



	    public static void main(String[] args) {
	        CircularLinkedList cll = new CircularLinkedList();
	        cll.insertSorted(5);
	        cll.insertSorted(2);
	        cll.insertSorted(7);
	        cll.insertSorted(1);

	        System.out.println("Sorted Circular Linked List:");
	        cll.display();
	    }
	}


