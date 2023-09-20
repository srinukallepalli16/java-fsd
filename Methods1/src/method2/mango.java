package method2;
public class mango{
	
	public void prime(int a) {
	
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println(a+" is the prime number");
		}
		else if(count==1) {
			System.out.println(a+" is the either prime or composiste");
		}
		else {
			System.out.println(a+" is not a prime number");
		}
	}
	public void srinu(String s) {
        System.out.println("Your name is :"+s);		
	}
	public void age(int age) {
		System.out.println("Your age is:"+age);
	}

}
