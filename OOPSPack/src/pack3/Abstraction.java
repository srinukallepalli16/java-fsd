package pack3;

abstract class Abstraction {

		
		 public abstract void draw();
		}

		
		class Circle extends Abstraction  {
		 
		 public void draw() {
		     System.out.println("Drawing a Circle");
		 }
		}

		class Rectangle extends Abstraction {
		
		 public void draw() {
		     System.out.println("Drawing a Rectangle");
		 }
		}

		class AbstractionDemo {
		 public static void main(String[] args) {
		
			 Abstraction circle = new Circle();
			 Abstraction rectangle = new Rectangle();

		    
		     circle.draw();
		     rectangle.draw();
		 }
		}


