
public class MultiDimensionArray {

	public static void main(String[] args) {
		// Declaration
		int [][] n;
		int n1 [][];
		int [] n2 [];
		//Instantiation
		n = new int[2][3];// 2 rows and 3 columns,
		//Declaration and Instantiation
		int [] n3 [] =new int [5][3];//5 rows and 3 columns
		
		//Initialization
		n[0][1]= 2;
		n[0][0]= 4;
		
		//Declaration and Instantiation and Intialization
		int arr[][] = {{1,2,3},{2,4,5}}; //2 rows 3 columns
		System.out.println(arr[0][0]);
		System.out.println(arr[1][0]);
		//index      0 1 2
		///     0|   1 2 3 
		///     1|   4 5 6
		
		for (int i = 0;i<2;i++) {
			for (int j=0;j<3;j++) {
			System.out.println(arr[i][j]);
		}
		System.out.println();
		}
		
		
	}

}
