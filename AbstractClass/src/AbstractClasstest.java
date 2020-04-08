
public class AbstractClasstest {

	public static void main(String[] args) {
		
		Bank nabil = new Nabil();
		
		Bank pravhu = new Pravhu();
		
		System.out.println(nabil.getExchangeRate());
		System.out.println(pravhu.getExchangeRate());
		System.out.println(nabil.getloanRate());
		System.out.println(pravhu.getloanRate());
	//we cannot create bank object because it is an abstract class
	//Bank b = new Bank();
		}

}
   