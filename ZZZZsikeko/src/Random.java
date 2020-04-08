import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
//		int a = 3;
//		int b=5;
//		int max= a>b?a:b;
//		int min = a<b?a:b;
		
		Scanner scan = new Scanner(System.in);
		int abcd = scan.nextInt();
		String name = scan.nextLine();
		boolean ac= scan.nextBoolean();
		System.out.println(ac);
		System.out.println();
		System.out.println(name);
		System.out.println(abcd);
//		System.out.println(max);
//		System.out.println(min);
	}

}
