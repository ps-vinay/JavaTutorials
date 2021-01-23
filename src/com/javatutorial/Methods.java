package com.javatutorial;

public class Methods {
    public static void main(String[] args) {
		sayHelloworld();
		
		sayHelloTo("charlie");
		sayHelloTo("john");
	
	}
    static void sayHelloTo(String name) {
    	System.out.println("Hello, " + name);
    }
    static void sayHelloworld() {
    	System.out.println("Hello, world!");
    }
}
