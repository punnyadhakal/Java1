//single
public class ClassB extends ClassA {
     int b=20;
     void sum() {
	System.out.println("sum is "+(a+b));
}
     void msg() {
    	 super.msg();  //method overriding
    	 System.out.println("value of b is " +b);
     }
}
