
public class OuterClass {
	static class InnerClass{   // also we can make it without the static 
		
	
		static void display() {     //this is an static inner class
			System.out.println("innerclass");
		}	
	}	
      static InnerClass in = new InnerClass();
      
      
      
	      // class Innerclass{
         //void display()  {	
         //  System.out.println("non static Inner class");
    	//}
		//}
        //  InnerClass in = new InnerClass();
      
      
      
	        	void display() {
	        		class Innerclass1{
	        			void display1() {
	        	            System.out.println("Method local Innerclass");
	        	
	        			}
		}
	
	      }
	        		void displayName() {
	        			System.out.println("Name");
	        		
	        		
	        		
		
	}
}