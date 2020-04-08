import java.util.Scanner;
//write a program to calculate the sum of the series 1+11+111+...+ up to N terms.
//If N is 5 , then series is: 1+11+111+1111+11111

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int N = 5; Also can be done without scanner
		int sum = 0;
		//for (int i =1;i<=5;i++) {
		for (int i=1;i<=N;i++) {
			int var =1;
			for (int j=0;j<i;j++){
				var = var*10+1;
			}
			System.out.println(i+"var; "+var);
			sum+=var;
		}
			System.out.println("sum:" +sum);
	}

}
