import java.util.Scanner;
//Write a program to calculate the series: 1x10 + 3x20 + 6x30 + .... + (N(N+1))x5N where N is an any positive integer.

public class SumOfSeries2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int sum = 0;
		for (int i=0;i<=N;i++) {
			int var = i*(i+1)*5*i;
			sum+= var;
			System.out.println(var);
		}
		System.out.println(sum);
	}

}
