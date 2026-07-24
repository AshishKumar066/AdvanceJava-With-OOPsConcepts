package AdvanceJava;


public class StaticNonStatic3 {
	
// static variable 
	static String name ;
	
//	No-static variable
	int id;
	
	
	
//	static method // class se blong krta h // static method due to belong with class 
	
	public static void s1(){
		
		System.out.println("StaticNonStatic3.s1()");		
	}

	public static void s2(){
		
		
		System.out.println("StaticNonStatic3.s1()");		
	}

	
//	instance method // object se belong krta h // Instance method due to belong with object 
	
	public void m1() {
		
		System.out.println("StaticNonStatic3.m1()");
		
	}
	
	
	public void m2() {
		
		
//		CALL STATIC METHOD 
		s1();
		s2();
//		CALL INSTANCE METHOD 
		m1();
		System.out.println("StaticNonStatic3.m1()");
		
	}
	
	

	
}
