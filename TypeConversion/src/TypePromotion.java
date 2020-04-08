
public class TypePromotion {

	public static void main(String[] args) {
		long a = 12;
		int b = 3;
		//int sum= a+b; //gives error because of long
		int sum = b +(int)a; //cast long to int before sum to prevent type promotion.
		long sum2 = a+b;// a is promoted to long.
		int sum1 =(int )(b+a); //Also, casting long result to integer
		
		float c =12.43f;
		
		float sum3= a+b+c;
		System.out.println(sum3);
		long sum4 =(long)  (a+b+c);
		int sum5 = (int)(a+b+c);
		System.out.println(sum5);
		
		//If there is upper level data type in any expression then it promoted all the data type of expression to the upper level .
		//in that case if we need lower level data type then we need to explicit/change  cast result yo required type
		
		// higher to lower level:
		//double float long int char short byte boolean 
		
	}

}
