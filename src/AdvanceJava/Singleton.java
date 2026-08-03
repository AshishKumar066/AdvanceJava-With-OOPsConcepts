package AdvanceJava;

/*

 Singleton Class 
 
Singleton Class ek aisi class hoti hai jiska poore application me sirf ek hi object create hota hai.

Agar koi dusra object banane ki koshish kare, to wahi existing object return hota hai.

Real-Life Example

Socho Printer office me ek hi hai.

Sab log usi printer ko use karte hain, alag-alag printer nahi banate.

Singleton Class bhi isi tarah kaam karti hai.
  
//  ---------------------------------------------------------------------------

 Abstract Class

Abstract class ek incomplete class hoti hai. Isme kuch methods complete ho sakte hain aur kuch methods sirf declare kiye jaate hain (jinki implementation nahi hoti).

Abstract class ka object directly create nahi kar sakte. Is class ko inherit karke uski abstract methods ko implement karna padta hai.
 
 */

//	######################################################################

// Step 1 :- 

class DataBaseConnection{

//public class Singleton {
//
//	public static void main(String[] args) {
//
//		DataBaseConnection db1 = new DataBaseConnection();
//		DataBaseConnection db2 = new DataBaseConnection();
//		DataBaseConnection db3 = new DataBaseConnection();
//		DataBaseConnection db4 = new DataBaseConnection();
//		DataBaseConnection db5 = new DataBaseConnection();
//		DataBaseConnection db6 = new DataBaseConnection();
//		DataBaseConnection db7 = new DataBaseConnection();
//
//		System.out.println(db1);
//		System.out.println(db2);
//		System.out.println(db3);
//		System.out.println(db4);
//		System.out.println(db5);
//		System.out.println(db6);
//		System.out.println(db7);
//	}

//Step 2 :- Check and use abstract 

//class DataBaseConnection {
//	
//}

	
//	1st 
//	public  DataBaseConnection() {
	private DataBaseConnection() {

		System.out.println("DatabseConnection.DatabaseConection()");

	}
	
//	2nd
//	Eager Loading / Early Instantiation 

//	 DataBaseConnection instance = new DataBaseConnection();
//	static DataBaseConnection instance = new DataBaseConnection();
	private static DataBaseConnection instance = new DataBaseConnection();  // Ham chahte h ki koyi outside the class access bhi na kre to private keyword use krenge !!

//	3rd
//	public DataBaseConnection getInstance() {
	public static DataBaseConnection getInstance() {

		return instance;
	}

}

public class Singleton {

	public static void main(String[] args) {

//		DataBaseConnection db1 = new DataBaseConnection();
		DataBaseConnection db1 = DataBaseConnection.getInstance();

//		DataBaseConnection db2 = new DataBaseConnection();
		DataBaseConnection db2 = DataBaseConnection.getInstance();

//		DataBaseConnection db3 = new DataBaseConnection();
		DataBaseConnection db3 = DataBaseConnection.getInstance();

//		DataBaseConnection db4 = new DataBaseConnection();
		DataBaseConnection db4 = DataBaseConnection.getInstance();

//		DataBaseConnection db5 = new DataBaseConnection();
		DataBaseConnection db5 = DataBaseConnection.getInstance();

//		DataBaseConnection db6 = new DataBaseConnection();
		DataBaseConnection db6 = DataBaseConnection.getInstance();

//		DataBaseConnection db7 = new DataBaseConnection();
		DataBaseConnection db7 = DataBaseConnection.getInstance();


		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);
		System.out.println(db4);
		System.out.println(db5);
		System.out.println(db6);
		System.out.println(db7);
	}

//Step 3 :- Create a public constructor 

//class DataBaseConnection {
//	
//	public DataBaseConnection() {
//		
//		System.out.println("DataBaseConnection.DataBaseConnection()");
//	}
//
//}
//
//public class Singleton {
//
//	public static void main(String[] args) {
//
//		DataBaseConnection db1 = new DataBaseConnection();
//		DataBaseConnection db2 = new DataBaseConnection();
//		DataBaseConnection db3 = new DataBaseConnection();
//		DataBaseConnection db4 = new DataBaseConnection();
//		DataBaseConnection db5 = new DataBaseConnection();
//		DataBaseConnection db6 = new DataBaseConnection();
//		DataBaseConnection db7 = new DataBaseConnection();
//
//		System.out.println(db1);
//		System.out.println(db2);
//		System.out.println(db3);
//		System.out.println(db4);
//		System.out.println(db5);
//		System.out.println(db6);
//		System.out.println(db7);
//	}

//Step 4 :- Create private constructor 

//class DataBaseConnection {
//	
//	private DataBaseConnection() {
//		
//		System.out.println("DataBaseConnection.DataBaseConnection()");
//		
//	}
//
//}
//
//public class Singleton {
//
//	public static void main(String[] args) {
//
//		DataBaseConnection db1 = new DataBaseConnection();
//		DataBaseConnection db2 = new DataBaseConnection();
//		DataBaseConnection db3 = new DataBaseConnection();
//		DataBaseConnection db4 = new DataBaseConnection();
//		DataBaseConnection db5 = new DataBaseConnection();
//		DataBaseConnection db6 = new DataBaseConnection();
//		DataBaseConnection db7 = new DataBaseConnection();
//
//		System.out.println(db1);
//		System.out.println(db2);
//		System.out.println(db3);
//		System.out.println(db4);
//		System.out.println(db5);
//		System.out.println(db6);
//		System.out.println(db7);
//		
//	}

}
