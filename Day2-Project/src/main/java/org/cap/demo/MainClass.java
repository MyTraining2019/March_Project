package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		greetings();
		
		SalesClass obj=new SalesClass();
		obj.show();

	}
	
	public static void greetings(){
		System.out.println("Hello! Good Morning!");
		System.out.println("Hello! Good Afternoon!");
		System.out.println("Hello! Good Evening!");
		System.out.println("Hello! Good Bye!");
	}
	
	public static void sayHello(){
		System.out.println("Hello! Good Morning!");
		
	}

}
