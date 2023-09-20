package pack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegularExpressions{
	public static boolean EmailValid(String email) {
		String regex="[\\w-]{1,20}@\\w{2,20}\\.\\w{2,3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your Email:");
		String email=input.nextLine();
		boolean valid= EmailValid(email);
		if(valid) {
			System.out.println(email+" \nGiven Email ID is valid:");
		}
		else {
			System.out.println(email+" \nGiven Email ID is Invalid:");
		}
	}
}

	


