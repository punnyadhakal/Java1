
public class MethodOverriding {

	public static void main(String[] args) {
		Override2 bus = new Override2();
		bus.run();
		Override1 van = new Override1();
		van.run();
		
		
		Override2 a = new Override2();
		a= new Override2();
		a.run();
		a = new Override1();
		a.run();
		
	}

}
