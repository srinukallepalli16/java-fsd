package pack;

public class Throw {
	public static void main(String[] args) {
		int a=55,b=0,result;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                result = a / b;
                System.out.println("The result is : " + result);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.println("Error : " + Ex.getMessage());
        }

        System.out.println("End of program.");
    }

	



}
