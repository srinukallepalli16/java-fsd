package com.pack;


	class Node {
	    int data;
	    Node next;
	    Node prev;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	class DoublyLinkedList {
		Node head;

	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	}

	    public void forwardTraversal() {
	        Node current = head;
	        System.out.println("Forward Traversal:");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	    
	    
	    public void backwardTraversal() {
	        Node current = head;
	        while (current != null && current.next != null) {
	            current = current.next;
	        }

	        System.out.println("Backward Traversal:");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }

		public static void main(String[] args) {
			DoublyLinkedList list = new DoublyLinkedList();
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);

	        list.forwardTraversal();
	        list.backwardTraversal();

		}

	}


