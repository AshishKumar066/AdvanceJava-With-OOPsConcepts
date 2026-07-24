package AdvanceJava;

import java.io.IOError;

class Animal {
	public  void m1() {
		
		System.out.println("Animal Ability !!");
		
		System.out.println("Hunt");
		}
	public void m2() {
			System.out.println("Eat");
		}
	public void m3() {
		System.out.println("Sleep");
	}
}

//------------------------------------

class Tiger extends Animal {
	public void m4() {
		System.out.println("Tiger Ability -->");
		System.out.println("Run Fast");
	}
	public void m5() {
		System.out.println("Active Form");
	}
}

//------------------------------------

class Lion  extends Animal{
	public void m6() {	
		System.out.println("Brave");
	}
	public static void m7() {	
		System.out.println("Group Hunt");
	}
}


//------------------------------------

class Cub extends Tiger{
	
	public void m8() {
		
		
		System.out.println("Drink Milk");
		
	}
}

public class Inharitance {
	public static void main(String[] args) {
		
		
		Animal a = new Animal();
		
//		Parent class
		
		a.m1();
		a.m2();
		a.m3();
//		a.m4(); Don't access without build a relation with required method class
		
		System.out.println("-------------------------");
		
		
		Tiger t = new Tiger();
		
		
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		t.m5();
		
		System.out.println("-----------------------");
		
		
		Lion l = new Lion();
		
		l.m1();
		l.m2();
		l.m3();
		l.m6();
		l.m7();
		
		System.out.println("-----------------------");

		
	    Cub c= new Cub();
	    
	    c.m1();
	    c.m2();
	    c.m3();
	    c.m4();
	    c.m5();
	    c.m8();
	    
	    System.out.println("-----------------------");
	    
		
	}
// parent , base , super 
	
}
