package pack2;

public class Finally {
	public static void main(String[] args) {
		int a=45,b=0,result=0;
        try
        {
            result = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.println("Error : " + Ex.getMessage());
        }
        finally
        {
            System.out.println("The result is : " + result);
        }
	}

}
