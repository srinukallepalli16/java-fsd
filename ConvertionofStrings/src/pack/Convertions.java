package pack;

public class Convertions {
	public static void main(String args[]) {
		String s1=new String("Srinivas is good crickter");
		StringBuffer s2=new StringBuffer();
		s2.append(s1);
	
		System.out.println();
		System.out.println("Convert String into StringBuffer:"+s2);
		System.out.println();
		System.out.println("Original String is:"+s1);
		System.out.println();
		System.out.println("Convert into String Buffer to String:");
		String s3=s2.toString();
		System.out.println();
		System.out.println("String Buffer to String:"+s3);
		
	}
}