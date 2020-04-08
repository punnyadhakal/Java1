package com.Javaclass;

public class ConstructorDemo {

	public static void main(String[] args) {
		Animal animal =new Animal();
		System.out.println( animal.getname());
		
		Animal animal1 =new Animal("Cattttt");
      System.out.println(animal1.getname());
      
      Animal animal2 =new Animal("mouse",2);
    System.out.println(animal2.getname());
	}

}
