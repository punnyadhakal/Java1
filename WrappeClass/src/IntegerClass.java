
public class IntegerClass {

	public static void main(String[] args) {
		
		int x =34;
		Integer y = new Integer(3);
		Integer z= new Integer("33");
		//Integer a1 = new Integer("two"); //this doesnot print as it is string and convert to integer.
		  
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		//System.out.println(a1);
		
		
		Integer a = 4;
		float c = y.floatValue(); //it automatically change to .floatvalue
		double d = a.doubleValue();
		int b = Integer.parseInt("2");
		
		
		
		//String binary = "0b" +Integer.toBinaryString(a);
		System.out.println(Integer.toBinaryString(a));
		
		
		
		
		Double d1= Double.parseDouble("23.54");
		System.out.println(d1);
		
		
		Integer i = Integer.parseInt("525");
		System.out.println(i);
	}

}
