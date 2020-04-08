
public class FindTraingularNumber {

	public static void main(String[] args) {	
		//for(int i=0;i<100;i++) {
			//System.out.println(i);
		//}
//		for (int a=1, b=5;a<b;a++,b--) {
//	    System.out.println(a+ ","+b);
			
//		int a,b;
	//	for ( a=1,b=2;a<b ;a++,b--) {
//			System.out.println(a+","+b);
				
//		int n;
		//for (int n=1;n<100;n++) {
			//System.out.println(n);}

		
			
		int n =15;
		int sum =0;
		for(int i=1;i<n;i++) {
			sum +=i; //sum = sum+i
			if(sum==n) {
	       System.out.println(sum+" This is an traingular number");
			break;		
		}
			if(sum>n) {
			System.out.println(sum+ "this is not a traingular number");
			break;
			}
		}	
		
		
		
//		int a = 3,b=6,c=9;
//		int n=0 ;
//		while(n!=10) {
//		n=n+1;
//		n=n++ ;
//		
//		
//		if (n==a) 
//			System.out.println("this is a triangular number"+n);
//		
//         if  (n==b) 
//			System.out.println("this is another triangular number");
//         
//		if (n==c) 
//			System.out.println("this is the last number for traingular number");
//		
//		 else {
//		System.out.println("this is a wrong program"+n);
//	 }
//		}
	//}
		
		
		
		
	
		
		
		
		
		
//		int i =1;
//		int n =1;
//		while (n<=10) {
//		n= n+i;
//		n++;
//		System.out.println("is an traingular number"+n);
//		}
	
		
//		int a = 3;
//		int b =6;
//		int c =9;
//		if (1+2 ==a ) {
//		System.out.println("this is a traingular number");
//		}
//	     if  (a+3==b) {
//		System.out.println("this is another traingular number");			
//		}
//	     if (b+a==c) {
//	    	 System.out.println("this is third traingular number");
//	     }
//	     else 
//	    	 System.out.println("none of them isa traingular number");
	}
}
