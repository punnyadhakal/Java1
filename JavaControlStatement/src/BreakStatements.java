
public class BreakStatements {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i==5) {
				break;
			}
	
		System.out.println(i);
		}
	    System.out.println("Break Called");
	
	
     for(int i=0;i<=10;i++) {
		   if(i==5) {
		 System.out.println("continue Called");
		   }
			continue;//it transfer the PC to the top of the block
		}
	
	
	for( int i=0;i<=10;i++) {
		   if(i==5) {
			   System.out.println("return called");
			   return; //it transfer the PC to the method caller
			   
		   }
		   System.out.println(i);
		   System.out.println("return");
	}
	}
}
