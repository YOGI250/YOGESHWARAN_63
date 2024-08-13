package com.vijay;

public class person {
	 String name;
	person(String name) {
		this(10);
		this.name=name;
		this.greeting();
		}
	
	person(int a){
		System.out.println("Age :"+ a );
	}
	
	
	void greeting() {
		System.out.println("Name "+ name);
	}
	public static void main(String [] args) {
		person obj =new person("Vijay");
	}

}