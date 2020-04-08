package com.javaclass;

public class StaticKeyword {

	public static void main(String[] args) {
		
	//Also	//Student.college = "kEC";
		//Static method cannot accept non static variables.
		Student std = new Student(1,"Bimal");
		Student std2 = new Student(2,"Punnya");
		std.display ();
		//Student.college ="ABC";
		std.display ();
		std2.display ();
		
       

	}

}
