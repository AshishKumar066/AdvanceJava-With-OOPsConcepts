package AdvanceJava;

class DataBaseConnectionn {

//	1st 
	private DataBaseConnectionn() {

		System.out.println("DatabseConnection.DatabaseConection()");

	}

//	2nd

	private static DataBaseConnectionn instance = null;

// 3rd
	public static DataBaseConnectionn getInstance() {

//		Lazy Loading / Lazy Instantiation 
		if (instance == null) {
			instance = new DataBaseConnectionn();
		}
		return instance;
	}
}

public class Singleton2 {

	public static void main(String[] args) {

		DataBaseConnection db1 = DataBaseConnection.getInstance();
		DataBaseConnection db2 = DataBaseConnection.getInstance();
		DataBaseConnection db3 = DataBaseConnection.getInstance();
		DataBaseConnection db4 = DataBaseConnection.getInstance();
		DataBaseConnection db5 = DataBaseConnection.getInstance();
		DataBaseConnection db6 = DataBaseConnection.getInstance();
		DataBaseConnection db7 = DataBaseConnection.getInstance();

		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);
		System.out.println(db4);
		System.out.println(db5);
		System.out.println(db6);
		System.out.println(db7);
		
	}
}
