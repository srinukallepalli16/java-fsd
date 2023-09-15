package pack1;

public class Throws {

	void Division() throws ArithmeticException
    {
        int a=45,b=0,result;
        result = a / b;
        System.out.println("The result is : " + result);
    }
    public static void main(String[] args)
    {
   	  Throws T = new Throws();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex) {
       	 System.out.println("Error : " + Ex.getMessage());
        }
         System.out.println("End of program.");
    }
}
