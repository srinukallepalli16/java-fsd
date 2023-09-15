package pack5;

public class Encpsulation {
	 private String name;
	    private int age;

	    
	    public Encpsulation(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    
	    public String getName() {
	        return name;
	    }

	    
	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public int getAge() {
	        return age;
	    }

	  
	    public void setAge(int age) {
	        if (age >= 0) {
	            this.age = age;
	        } else {
	            System.out.println("Age cannot be negative.");
	        }
	    }

	 
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {
	 
	    	Encpsulation person = new Encpsulation("John", 30);

	       
	        System.out.println("Initial Details:");
	        person.displayDetails();

	  
	        person.setName("Alice");
	        person.setAge(-25); 

	        
	        System.out.println("\nUpdated Details:");
	        person.displayDetails();
	    }
	}


