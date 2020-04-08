
public class MethodOverLoading {
	
	public static void main(String[] args) {
		AdditionOperation addition = new AdditionOperation();
		System.out.println(addition.add());
		System.out.println(addition.add(2));
		System.out.println(addition.add(2.2f));
		System.out.println(addition.add(3,4));
		System.out.println(addition.add(5+6+8));
		System.out.println(addition.add(2.12f,2));
        
	
	
	MultiplicationOperation mul = new MultiplicationOperation();
	mul.multiplication(2,3);
	
	
	
	}	
}
