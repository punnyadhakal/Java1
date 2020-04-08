
public class FinalKeyword {
//doesnot let u change any values.
	public static void main(String[] args) {
		Bike bike =new Bike(120);
		
		//final variable
	System.out.println(bike.speed);
//		bike.speed =120;
		//System.out.println(bike.speed);
		
		//final method
		bike.getSpeed();
		
		//final class
		Bus bus = new Bus();
		bus.getSpeed();
	}

}
