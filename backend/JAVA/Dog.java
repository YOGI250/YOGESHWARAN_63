package com.vijay;

public class Dog {
	String name;
	String breed;
	
	Dog ( String name, String breed){
		this.name=name;
		this.breed=breed;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public void setbreed(String breed) {
		this.breed=breed;
	}
	public String getname(String name) {
		return name;
	}
	public String getbreed(String breed) {
		return breed;
	}
	
	public void details() {
		System.out.println("Name :"+name +"Breed :"+ breed);
	}

	public static void main(String[] args) {
		Dog dog1=new Dog("labdour","german");
		dog1.details();
        dog1.setname("prakash");
        dog1.setbreed("breed");
        dog1.details();
	}

}
