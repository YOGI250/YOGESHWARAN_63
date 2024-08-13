package com.vijay;

public class Circle {
       int radius=5;
       int area;
       int circumference;
       public void print() {
    	   
    	   System.out.println("Radius ="+radius);
    	   System.out.println("Area :"+Math.PI*radius);
    	   System.out.println("circumfrrence :"+2*Math.PI*radius);
    	   

	}
       public static void main(String []args) {
    	   Circle obj1=new Circle();
    	   obj1.print();
       }

}
