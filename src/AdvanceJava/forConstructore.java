package AdvanceJava;

public class forConstructore {

	public static void main(String[] args) {
		
		MicroEmployee vinay = new MicroEmployee(01,30000,"Navi","US","StarLine" );
		
		System.out.println(vinay.name);
		
		System.out.println("-----------------------------");
		
		vinay.print();
		
	}
	
}
