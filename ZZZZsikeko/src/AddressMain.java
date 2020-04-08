
public class AddressMain {

	public static void main(String[] args) {
		
			
			
		Address ad = new Address("khaireni","Rupandehi","Devdaha");
		Address2 as = new Address2("punnya",ad);
		
		as.printAdd();
		System.out.println();
	    as.setName("hari");
	    
	    
	 
		
		System.out.println(as.name);
		System.out.println(ad.city);
		System.out.println(ad.town);
		System.out.println(ad.village);
		System.out.println("\n");
		
		as.setName2("\t ram");	
		as.printAdd();
		
		}

	}


