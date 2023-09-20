package pack;
import java.util.*;

	public class Maps{
	    public static void main(String[] args) {
	        
	        Map<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("srinivas", 25);
	        hashMap.put("David", 30);
	        hashMap.put("Virat", 35);
	        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
	        linkedHashMap.put("Power", 1);
	        linkedHashMap.put("Star", 2);
	        linkedHashMap.put("PSPK", 3);
	        Map<String, Integer> treeMap = new TreeMap<>();
	        treeMap.put("pine", 1);
	        treeMap.put("apple", 2);
	        treeMap.put("orange", 3);
	        System.out.println("HashMap:");
	        for (String key : hashMap.keySet()) {
	            System.out.println(key + " -> " + hashMap.get(key));
	        }
	        System.out.println("\nLinkedHashMap");
	    }

}
