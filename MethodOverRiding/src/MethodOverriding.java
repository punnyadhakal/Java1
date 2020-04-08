
public class MethodOverriding {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.run();
		Bus bus = new Bus();
		bus.run();

		
		//Static role in inheritance.
//		System.out.println(Vehicle.speed);  
//		Bike.speed =80;
//		System.out.println(Vehicle.speed);
//		
		
		//Runtime Polymorphism.(multiple state);
	 Vehicle vehicle;    //Vehicle vehicle=new Vehicle();
	 vehicle = new Bike();
	 vehicle.run();
	 vehicle= new Bus();
	 vehicle.run();
		
		Bike bike1;
		bike1 = new Bus();
		bike1.run();
		bike1 = new Bike();
		bike1.run();
		
		
	}

}
