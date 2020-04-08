package com.javaclass;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n);
		String name = scanner.nextLine();
		scanner.nextLine();
		System.out.println(name);
	}

}
