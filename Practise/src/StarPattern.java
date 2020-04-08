
public class StarPattern {
			//*****
			//*****
			//*****
			//*****
			
	//also to print 
	//		#
	//     ##
	//	  ###
	//   ####
	public static void main(String[] args) {
		for(int i =0;i<=4;i++) {	//to print row
			for( int j=0;j<=5;j++) { 		//to print column
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i =0;i<4;i++) {	           //to print row
			for( int j=3;j>=0;j--) { 		//to print column
				if(i>=j)
				System.out.print('#');
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		

		
		
	}

}
