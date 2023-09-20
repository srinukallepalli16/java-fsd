package pack;

public class ExceptHand {
	public static void main(String[] args) {
        try {
            
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }

}
