
public class Agg2 {
      String name;
      Agg1 address;
      
      public Agg2(String name,Agg1 address) {
    	  this.name = name;
    	  this.address = address;
      }
    	  void display() {
    		 System.out.println(name);
    		 System.out.println(address.city);
    		 System.out.println(address.town);
    		 System.out.println(address.village);
    		 
    		 
    	  
      }

	
		
	}


