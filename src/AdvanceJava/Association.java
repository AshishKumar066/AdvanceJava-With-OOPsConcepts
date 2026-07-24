package AdvanceJava;

//class Accenture {
//
//	private String empName, address;
//
//	private int empId;
//
//	public Accenture(String empName, String address, int empId) {
//		this.empName = empName;
//		this.address = address;
//		this.empId = empId;
//	}
//	
//
//    public String toString() {
//    	
//    	return "Accenture [ EmpName = "+empName+" , Address = "+address+" , EmpId = "+empId+" ]";
//    }
//	
//
//}

class Car {

	String name;
	Driver driver;
//  Strong dependent
	final Engine engine; 
	
	
	public Car() {
//		Strongly Association 
		engine = new Engine(23500,3455);
		
		System.out.println("Car.Car()");
	}


	@Override
	public String toString() {
		return "Car [name=" + name + ", driver=" + driver + ", engine=" + engine + "]";
	}

}

class Engine {

	int hp, torqe;

	public Engine(int hp, int torqe) {
		this.hp = hp;
		this.torqe = torqe;
		System.out.println("Engine.Engine()");

	} 

	@Override
	public String toString() {
		return "Engine [hp=" + hp + ", torqe=" + torqe + "]";
	}

}

class Driver {

	private String empName, address;

	private int empId;

	public Driver(String empName, String address) {
		this.empName = empName;
		this.address = address;
		System.out.println("Driver.Driver()");
	}

	@Override
	public String toString() {

		return "Driver [ EmpName = " + empName + " , Address = " + address + " ]";
	}

}

public class Association {

	public static void main(String[] args) {

//		Accenture ac1 = new Accenture("Anubhava", "Delhi", 01);
//
//		System.out.println(ac1);
		//// System.err.println(ac.toString()); toString Automaticly call your self
//
//		Accenture ac2 = new Accenture("Vijay", "Noida", 02);
//		System.out.println(ac2);

		Driver k = new Driver("Krishna", "Dwarika");

		Car c= new Car();
		
		System.out.println(c);
		c.name = "BMW";
		
		System.out.println(c);
		
		c.driver = k;
		System.out.println(c);
		
		
		
		
		
	}
	

}
