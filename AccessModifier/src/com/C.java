package com;



import com.java.A;

public class C extends A{

	public static void main(String[] args) {
		
     B bobj  = new B();
     System.out.println(bobj.b);
     //System.out.println(bobj.getB());
     
     
     
     A aobj = new A();
     //System.out.println(aobj.a);
     System.out.println(aobj.getA());
	}

}
