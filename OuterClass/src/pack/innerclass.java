package pack;

import pack1.outerclass;

public class innerclass {
	
	    public static void main(String[] args) {
	        outerclass outer = new outerclass();

	  
	        outerclass.MemberInner memberInner = outer.new MemberInner();
	        memberInner.display();

	      
	        outerclass.StaticInner staticInner = new outerclass.StaticInner();
	        staticInner.display();

	    
	        outer.localInnerDemo();

	        outer.anonymousInnerDemo();
	    }
	}



