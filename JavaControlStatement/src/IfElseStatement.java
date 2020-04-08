

public class IfElseStatement {

		//if(condition){
		//statement1;
		//..
		//}else{
	// elsestatement1;
		//...

		//if condition is true then execute statements inside {}block of if
//if condition is false then it do not execute statements inside {}block of else
		//if(condition)
		//statement1;
	//else
	//statement2;

    public static void main(String[] args) {
	int a  = 9;																				
	if(a%2!=0)																					
		System.out.println(a + "is an odd number");												
	else
		System.out.println(a + "is an even number.");
	System.out.println(".....is an block statement.....");
	
	
	
      a = 7;
      if(a%2==0) {
    	  System.out.println(a + "is an odd number");
      
      } else { 
      
    	  System.out.println(a+ "is an even number");
    }
    }
}


