
public class TypeConversion {

	public static void main(String[] args) {
		byte b = 0b0000101;
		int a = b; 	//Implicit type casting or type conversion.
       System.out.println(a);
       byte c = (byte)a;//explicit type casting.
       //System.out.println(c);
       
       int n =123;
       long l=n;
       float f = n;
       System.out.println(f);
      // int abc = (int)f;
       float f1 = 123.456f;
       int abc = (int)f1;
       System.out.println(abc);
       
       
       
       double d = f1;
       float f2 =(float)d;
       
       char ch ='a';
       int valueofa= ch;
      
       System.out.println(valueofa);
       char ch1 = (char)valueofa;
       System.out.println(ch1);
       
       
	}

}
