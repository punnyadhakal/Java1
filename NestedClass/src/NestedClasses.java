
public class NestedClasses {
	public static void main (String[]args) {
		//OuterClass out = new OuterClass();
		//out.display();
		//out.in.display();
		OuterClass.in.display();
		
		
	
		//Here we r using Anonymous Innerclass
		OuterClass out = new OuterClass() {
			@Override
			void displayName() {
				System.out.println("Name 1");
			}
		};
		out.displayName();
		
		
		MathDemo math =new MathDemo(5,4);
		System.out.println(math.sum());
		
//		
//		MathDemo mu1 = new MathDemo(6,7) {  //this is anonyomous Inner class.It just override the given methods.
//		@Override
//		int sum() {
//			return  a*b;
			
			
			
			MathDemo nyc = new MathDemo(6,2) {
			@Override
			int sum () {
				return a/b;
			}
		};
	//System.out.println(mu1.sum());
	System.out.println(nyc.sum());

	MathDemo math1 =new MathDemo(9,4);
	System.out.println(math1.sum());
	
}
}