
public class InterfaceImplTest {

	public static void main(String[] args) {
		Bank n = new NabilBank(); //runtime polymorphism
		printBankInfo(n.getbankName(),n.getRate(),Bank.serviceChargeRate);
		
		PrabhuBank p = new PrabhuBank(); //compiletime polymorphism
		printBankInfo(p.getbankName(),p.getRate(),Bank.serviceChargeRate);
		
	}
	public static void printBankInfo(String name,double rate,int servicecharge) {
		
		System.out.println("Bank Name"+ name);
		System.out.println("Interest Rate :"+rate);
		System.out.println("Service Charge :"+servicecharge);
	}

}
