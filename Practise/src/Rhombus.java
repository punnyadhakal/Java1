
    public class Rhombus {

	public static void main(String[] args) {
		int a = 7;
		for(int i=1;i<=a;i++) {
			for(int j=a;j>=1;j--) {
				if(j<=i) {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
				
			for(int j=2;j<=a;j++) {
				if(j<=i) {
				System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=a-1;i>=1;i--) {
			for(int j=a;j>=1;j--) {
				if(j<=i) {
				System.out.print(j);
			}else {
				System.out.print(" ");
			}
		}
			for(int j=2;j<=a;j++) {
				if(j<=i) {
				System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	
//		int noofcolumns=1;
//		int startr=0;
//		int size=17;
//		int noofspace=size/2;
//
//		for(int i=1; i<=size;i++) {
//
//		for(int j=1;j<=noofspace;j++) {
//		System.out.print(" ");
//		}
//		if (i<size/2+1) {
//		startr=i;
//		noofspace=noofspace-1;
//		}else {
//
//		startr=(size+1)-i;
//		noofspace=noofspace+1;
//		}
//
//		for(int j=1; j<=noofcolumns;j++) {
//		int middlecolumn=noofcolumns/2+1;
//		System.out.print(startr);
//		if(j<middlecolumn) {
//		startr--;
//		}else
//		{startr++;
//		}
//		}
//		System.out.println();
//		if(i<size/2+1) {
//		noofcolumns=noofcolumns+2;
//		}else {
//
//		noofcolumns=noofcolumns-2;
//		}
//		}
		}
}
    
