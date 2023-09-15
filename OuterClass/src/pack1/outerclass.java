package pack1;

public class outerclass {
	

	
	    private int outerVar = 10;

	    
	    public class MemberInner {
	        public void display() {
	            System.out.println("Value of outerVar from MemberInner: " + outerVar);
	        }
	    }
	    public static class StaticInner {
	        public void display() {
	            System.out.println("It is a static inner class");
	        }
	    }

	  
	    public void localInnerDemo() {
	        class LocalInner {
	            public void display() {
	                System.out.println("It is a local inner class");
	            }
	        }
	        LocalInner localInner = new LocalInner();
	        localInner.display();
	    }

	    
	    interface Anonymous {
	        void display();
	    }

	    public void anonymousInnerDemo() {
	        Anonymous anonymous = new Anonymous() {
	            public void display() {
	                System.out.println("It is an  inner class");
	            }
	        };
	        anonymous.display();
	    }
	}


