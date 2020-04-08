
public class DoWhileLoop {
	//do{
		//statement;
		//	}while(condition);
		//it run block first time with out checking condition.
		//it repeats the while block until the condition is true.
	public static void main(String[] args) {
		int n = 5;
		int sum1 = 0;
		do {
			System.out.println("top="+n);
			sum1 +=n;
			--n;
			System.out.println("sum="+sum1);
			System.out.println("bottom="+n);
		}while(n!=0);
		
		
		}
	
	
	}


