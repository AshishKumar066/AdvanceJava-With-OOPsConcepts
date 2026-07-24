package AdvanceJava;

// Create a class using the name is Animal 

class Animal1 {

	private String name;

	// create a cunstructer for get the value of name :😊

	public Animal1(String name) {

		this.name = name;

	}
	
	// create a getter method for get the value of name in other class 
	
	public String getName() {
		return name;
	}

	// These are three methods for Basic Animal -------------
	
	public void eat() {

		System.out.println(name + "Animal.eat()");
	}

	public void hustle() {

		System.out.println("Animal.hustel()");
	}

	public void sleep() {

		System.out.println("Animal.sleep()");
	}
}

// It's child class------------------

class Tiger1 extends Animal1 {

	private String color;
	
	//Create a constructor

	public Tiger1(String name, String color) {

		// use the super keyword for get the value of parent variable  

		super(name);

		this.color = color;

	}
	
	// Create a getter method for return the value for other classes 
	
	public String getColor() {
		return color;
	}

	//Create a method for Tiger1 ---------------
	
	public void hunt() {
		System.out.println(color + " : Tiger.hunt()");
	}
}

class cub extends Tiger1 {

	private int age;

	public cub(String name, String color, int age) {

		super(name, color);

		this.age = age;
		System.out.println("cub age is : " + age);

	}
	
	public void cubAge(){
		
		System.out.println("cub is : "+age+" Years !");
	}

	public void print() {

		System.out.println("Name is : " + getName());

		System.out.println("Name is : " + getColor());

		System.out.println("Name is : " + age);

	}
}

public class supperlnharitance {
	public static void main(String[] args) {

		Animal1 a = new Animal1("Simbha");

		a.eat();
		a.hustle();
		a.sleep();

		System.out.println("-----------------------------");

		Tiger1 t = new Tiger1("Simbha", "Brown");

		t.eat();
		t.hustle();
		t.sleep();
		t.hunt();

		System.out.println("-----------------------------");
		
		cub c = new cub("Simbha", "Brown", 3);
		c.eat();
		c.hustle();
		c.sleep();
		c.hunt();
		c.cubAge();
		System.out.println("-----------------------------");
//
		c.print();
	}
}