package pack1;
   public class access1 {
   private int a;
   private int b;
   protected int c;
   public void modify(int a,int b,int c) {
	   this.a=a+b;
	   this.b=b*a;
	   this.c=a+b+c;
   }
   public String getAccess() {
	   return String.format("Sum of two numbers=%s\nProduct of two numbers=%s\nSum of two numbers=%s", a,b,c);
   }

}
