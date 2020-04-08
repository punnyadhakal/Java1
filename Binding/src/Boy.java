
public class Boy extends Human{
	
	public void walk() {
		System.out.println("Boy can run");
	}
	public static void main(String[] args) {
		//static binding
		Human h = new Human();
		h.walk();
		Boy boy = new Boy();
		boy.walk();
		 
		//dynamic binding
		Human hb = new Boy();
		hb.walk();

		
		
		
	}

}
