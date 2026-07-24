package AdvanceJava;

public class getterSetter {
	
	private int age ;
	private String name , gender , address;
	
	
//	JAVA CONSTANT 
//	Standerd: Use the capital latter fir declare any object name and also use the snack case like : COMP_NAME , and also assigne the value at the same time. 
	public static final String  company = "HCL";
	
	
	public getterSetter(String name, int age, String gender, String adderss) {
	
		this.name= name ;
		this.age= age;
		this.gender= gender ;
		this.address= adderss;
		
				
	}
	
// for set the values of varibale   // setter
	
	public void setName(String name) {
		this.name= name;
		
	}
	public void setAge(int age) {
		this.age= age;
		
	}
	public void setGender(String gender) {
		this.gender= gender;
		
	}
	public void setAddress(String adderss) {
		this.address= adderss;
		
	}
	
//	public void setCompany(String company) {
//		this.company= company;
//		
//	}
	
	
	
	// for get the values of varibale  // getter
	
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
			
		}
		public String getGender() {
			return gender;
			
		}
		public String getAddress() {
			return address;
					
		}
		
		public String getCompany() {
			return company;
			
		}	
	
	
	public void print() {
		
		System.out.println("Employee name is "+ name);
		System.out.println("Employee age is "+ age);
		System.out.println("Employee gender is "+ gender);
		System.out.println("Employee comapny name is "+ name);
		System.out.println("Employee address is "+ address);
		System.out.println("Company name is "+ company);
		
		System.out.println("---------------------------------------------");
		
	}
	
	

}
