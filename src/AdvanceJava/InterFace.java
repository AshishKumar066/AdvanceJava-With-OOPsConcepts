package AdvanceJava;

interface MyInterface {

//	public  void m1() {        // OR 
	public static void m1() { // OR

//		Default method ko Override kiya ja skta h ? -> Yes 

//	public default void m1() {   // default is a NonStatic method , it's reason not provide the access this method in another static class !! 

		System.out.println("MyInterface.m1()");

	}

}

public class InterFace {

	public static void main(String[] args) {

		MyInterface.m1();

	}

}
