
public class NestedifStatement {

	public static void main(String[] args) {
		int n = 12;
		if(n%2 ==0)  { 
			System.out.println(n + "is divisible by 2");
		if(n%5==0) {
			System.out.println(n +"is also divisible by 5");
		}else {
			System.out.println(n + "is not divisible by 5");
			
		}
		
		}else {
			System.out.println(n + "is not divisible by 2");
			
		}
		}

}
