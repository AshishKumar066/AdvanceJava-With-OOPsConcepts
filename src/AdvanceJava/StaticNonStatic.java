package AdvanceJava;


public class StaticNonStatic {
	
//	Inatance variable 
	
	int id ;
	
//	static variable 
	
	static String name ;
	
//	intance method 
	
	public void m1() {
		
		m2();
		System.out.println(name);
		
		System.out.println("StaticNonStatic.m1()");
			
	}
	
	public void m2() {
	
		System.out.println("StaticNonStatic.m1()");
	
	
	}
	
	
//	static method 
	
	public static void s1() {
		
		System.out.println(name);
		
		
		System.out.println("StaticNonStatic.s1()");
		
	}
	
	public static void s2() {
	
		
	
		System.out.println("StaticNonStatic.s1()");
	
	}
	
	
	
	public static void main(String[] args) {
		
	}

	

}
