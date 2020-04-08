
public class UnaryOperator {

	public static void main(String[] args) {
		int a =3;
		//postfix operator
		System.out.println("post");
		System.out.println(a);
		System.out.println(a++); //a=a+1
		System.out.println(a);
		System.out.println(a--);//a=a-1
		System.out.println(a);
		
		//prefix operator
		System.out.println("pre");
		System.out.println(++a); //a=a+1
		System.out.println(a);
		
		System.out.println(--a);//a=a-1
		System.out.println(a);
		
		System.out.println("\n");
		int b = a++; // b=a; a=a+1
		System.out.println(b);
		int c = ++a; //c = a+1; c=a;
		System.out.println(a);
		System.out.println(c);
		boolean istrue = false; //!istrue =false or viceversa 
		boolean isfalse= !istrue;
		if(!istrue) {
			System.out.println(istrue);
		}
		
	}

}
