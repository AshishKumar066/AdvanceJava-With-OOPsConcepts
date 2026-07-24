package AdvanceJava;

public class MicroEmployee {
	
	
	int id, salary ;
	String name, address, compName;
	
	public MicroEmployee(int id, int salary , String name, String address , String compName) {
		
//		this.id = id ;
//		this.salary = salary;
		this.name= name;
//		this.address= address;
		this.compName= compName;
		
		
	}
	
		
//	Creating a method for print the all values of Employee
	public void print() {
		
		
		System.out.println("Employee id is : "+ id );
		
		System.out.println("Employee salary is : "+ salary);
		
		System.out.println("Employee name is : "+ name);
		
		System.out.println("Employee address is : "+ address);
		
		System.out.println("Employee compName is : "+ compName);
		
		
	}

}
