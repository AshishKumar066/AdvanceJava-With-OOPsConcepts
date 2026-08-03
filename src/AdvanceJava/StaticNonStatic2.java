package AdvanceJava;

public class StaticNonStatic2 {

	// Non Static --------------------------

	public void n1() {

		n2();
		n1();
		s1();
		s2();

		System.out.println("NON STATIC N-1");
	}

	public void n2() {

		n1();
		n2();
		s1();
		s2();

		System.out.println("NON STATIC N-1");

	}

	// Ststic ------------------------------------ These error showing that don't
	// access static method or object in no-static class !!

	public static void s1() {

		s2();
		s1();
//		n1();    --> No
//		n2();    --> No

		System.out.println("STATIC FUNCTION S-1");
	}

	public static void s2() {

		s1();
		s2();
//		n1();    --> No
//		n2();    --> No

		System.out.println("STATIC FUNCTION S-1");
	}

	public static void main(String[] args) {

	}

}
