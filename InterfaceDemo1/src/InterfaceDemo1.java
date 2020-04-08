
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Printable printable1 = new Printableimpl();
		printable1.print();
		Printable printable2 = new Printableimpl();
		//printable2.MIN =4; cannot be changed since it will be final in interface.
		printable2.print();
	}

}
