package pack;
    import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Iterator;
public class collections{
	
	    public static void main(String[] args) {
	        
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");

	       
	        LinkedList<String> linkedList = new LinkedList<>();
	        linkedList.add("Dog");
	        linkedList.add("Cat");
	        linkedList.add("Bird");
	        HashMap<Integer, String> hashMap = new HashMap<>();
	        hashMap.put(1, "One");
	        hashMap.put(2, "Two");
	        hashMap.put(3, "Three");
	        System.out.println("ArrayList:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }
	        System.out.println("\nLinkedList:");
	        for (String animal : linkedList) {
	            System.out.println(animal);
	        }

	      
	        System.out.println("\nHashMap:");
	        for (int key : hashMap.keySet()) {
	            System.out.println(key + " -> " + hashMap.get(key));
	        }

	       
	       
	        }
	    }

	



