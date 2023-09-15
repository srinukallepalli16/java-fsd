package pack;
public class SleepThread{

	
	private static Object obj =new Object();
	
	public static void main(String[] args)throws InterruptedException 
	{
		Thread.sleep(1000);
		System.out.println("Thread'" +Thread.currentThread().getName()+"'is woken after  sleeping for 1sec");
		synchronized(obj) {
			obj.wait(1000);
			System.out.println("Object'"+obj+"' is woken after"+"waiting for 1sec");
		}	
		
	}
	
}