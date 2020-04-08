
public class Nepal {

	
	public static void main(String[] args) {
		
//		char ch[] = {'N','E','P','A','L'};
//		for( int i = 0;i<5;i++) {
//			for(int j =0;j<=i;j++) {
//			System.out.print(ch[j]);
//		}
//			System.out.println();
		
		//}

//		char ch[]= {'P','R','O','G','R','A','M','M','I','N','G'};
//		 for (int i =10;i<=0;i--) {
//			for(int j =11;j<=i;j--) {
//				System.out.println(ch[i]);
//			 System.out.print(ch[j]);
//			 
//		 }
//	}
		
		 int a[] = { 
				    0b0001000100010000010001000, 
				    0b0001001010001000100010100, 
				    0b1001011111000101000111110,
				    0b0110100000100010001000001 };
				  int cmp = 0b0000001;   //1  in binary it take off all the zeros.
				  for (int i = 0; i < a.length; i++) {
				   for (int j = 24; j >= 0; j--) {
				    if (j > 20) {
				     if ((a[i] >> j & cmp) > 0) {
				      System.out.print("j");
				     } else {
				      System.out.print(" ");
				     }
				    }else if (j > 13) {
				     if ((a[i] >> j & cmp) > 0) {
				      System.out.print("a");
				     } else {
				      System.out.print(" ");
				     }
				    }else if (j > 6) {
				     if ((a[i] >> j & cmp) > 0) {
				      System.out.print("v");
				     } else {
				      System.out.print(" ");
				     }
				    }else {
				     if ((a[i] >> j & cmp) > 0) {
				      System.out.print("a");
				     } else {
				      System.out.print(" ");
				     }
				    }
				   }
				   System.out.println();
				  }		
				
				

			 
		 }
	}



