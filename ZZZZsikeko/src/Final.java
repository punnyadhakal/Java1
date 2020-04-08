
public class Final {

	
//	final int a =5;
//	final double d= 3.1545;
//	public static void main(String[] args) {
//		
//       Final nyc = new Final();
//  nyc.a = 10; // cannot assign another value to a.
//   nyc.d= 4.15; // cannot assign different values to d.
//   System.out.println(nyc.a+ " \n"+ nyc.d);
//	}

	static void myStaticMethod() {
		System.out.println("this is a learning phase");
	}
	public void myPublicMethod() {
		System.out.println("this is an public method");
	}
		public static void main(String[]args) {
			myStaticMethod();
			Final cla = new Final();
			cla.myPublicMethod();
			}
	}
	
	

