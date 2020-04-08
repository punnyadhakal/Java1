
public class MultipleInterface {

	public static void main(String[] args) {
		Bank1 b1 = new NicAsia();
		System.out.println(b1.bankName());
//	     System.out.println(b1.getRate());
//		 System.out.println(b1.getinterestRate());
		
		NicAsia pr = new NicAsia();
		System.out.println(pr.bankName());
	     System.out.println(pr.getRate());
		System.out.println(pr.getinterestRate());
		
		Bank2 be = new NicAsia();
        //Bank2 be=  new Bank2();(cannot make an object for an interface)
		 System.out.println(be.bankName());
	     System.out.println(be.getRate());
		//System.out.println(be.getinterestRate());
		
		
	}

}
