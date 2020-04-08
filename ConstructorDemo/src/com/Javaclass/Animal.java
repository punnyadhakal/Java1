package com.Javaclass;

public class Animal {
     String name;
    
     {
    	 System.out.println("block statement");
     }
	
    Animal() {
    	this.name = "Dog";
    	System.out.println("default constructor called");
	}
    Animal(String name){
    	this.name = name;
    	System.out.println("this is Parameterized constructor");
    }
    Animal(String name, int a ){
    	this.name = name;
    	
    	System.out.println("this is Parameterized constructor with a ");
    }
    String getname() {
    	return name;
     
    }


}



