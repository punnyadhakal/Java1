
public class BreakGoTo {
	// label : {
	// break label;
	//}

	public static void main(String[] args) {
		boolean t = true;
		
		first : {
			System.out.println("first");
			second : {
			System.out.println("Second");
			third : {
				System.out.println("Third");
				if(t) {
					break second;
				}
				System.out.println("this wont execute");
		}
			System.out.println("Second last");
			
		}
		System.out.println("First last");
		
		}
	}

}
