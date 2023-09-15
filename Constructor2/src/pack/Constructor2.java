package pack;
import pack1.Constructor3;
class Constructor2 {
	public static void main(String args[]) {
		Constructor3 object=new Constructor3(12,25,35);
		Constructor3 object1=new Constructor3(11,35,63);
		Constructor3 object2=new Constructor3(13,25,35);
		Constructor3 object3=new Constructor3(15,32,25);
		System.out.println("TIME:"+object.getTime());
		System.out.println("TIME:"+object1.getTime());
		System.out.println("TIME:"+object2.getTime());
		System.out.println("TIME:"+object3.getTime());
		
	}

}
