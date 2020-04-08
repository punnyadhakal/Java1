
public class ObjectClass {

	@Override
	public String toString() {
		return "helloooo000000";
	}

	public static void main(String[] args) {
		ObjectClass obj = new ObjectClass();
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		
		
	}

}