
public class Pattern {
//	Display the Pattern
//
//	Programming
//	Programmin
//	Programmi
//	Programm
//	Program
//	Progra
//	Progr
//	Prog
//	Pro
//	Pr
//	P
	public static void main(String[] args) {
		//String name = "programming";
		String name = new String("Programming");
		for (int i=0;i<name.length();i++) {
			for(int j=0;j<name.length()-i;j++) {
				System.out.print(name.charAt(j));
			
			}
			System.out.println();
		}
		char ch[]= {'P','R','O','G','R','A','M','M','I','N','G'};
		for (int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length-i;j++) {
				System.out.print(ch[j]);
				
			}
			System.out.println();
		}
			}
	}

