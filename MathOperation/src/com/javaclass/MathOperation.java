package com.javaclass;

public class MathOperation {

	public static void main(String[] args) {
		Addition1 addition = new Addition1();
		int sum = addition.calculation(12,5);
		System.out.println(sum);
		System.out.println("sum is"+ sum);
		
		Subtraction subtraction = new Subtraction();
		int sub = subtraction.calculation(10,5);
		System.out.println("subtraction ="+sub);
		
		Multiplication multiply = new Multiplication();
		int total = multiply.calculation(5,3);
		System.out.println("Multiplication is "+ total);
		System.out.println(multiply.i);
		Multiplication c =new Multiplication();
		System.out.println(c.calculation(4, 3));
		
		Reminder reminder = new Reminder();
		int rem= reminder.calculation(10,3);
		System.out.println("reminder is "+ rem);
		
		
	}

}
