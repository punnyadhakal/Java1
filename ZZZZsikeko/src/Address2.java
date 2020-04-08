
public class Address2 {

	
	String name ;
	Address address;
	
		Address2(String name, Address address){
			this.name = name ;
			this.address= address;
		}
			
		void setName(String name) {
			this.name = name;
		}
		void setName2(String name) {
			this.name = name;
		}
			
			void printAdd() {
				System.out.println(name);
			System.out.println(address.city);
			System.out.println(address.town);
			System.out.println(address.village);
			
		}
	}

