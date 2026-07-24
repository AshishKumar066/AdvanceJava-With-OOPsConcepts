package AdvanceJava;
public class InstanceStaticLocalBlock {
	
	
//	instance and static variables 
	
	String name ;
	static int id ;
	
//	intance block 
	
	{
		
		System.out.println("Instanc.Block2");
	}

	{
	
		System.out.println("Instanc.Block1");
	}
	
	
	
//	Constructor Creation ---------------------------------------
	
	public InstanceStaticLocalBlock() {
		
		System.out.println("Constructor.Block1");
	}
	
	
//	Static block 
	
	static{
		System.out.println("Static.Block2");
	}
		
	static{
		System.out.println("Static.Block1 ");
	}
	
	
//	Method creation
	
	public void method() {
		
		System.out.println("Method...................");
	}
		
	
	
//	------------------------------------------------------------------
	
	public static void main(String[] args) {
				
		InstanceStaticLocalBlock t1 = new InstanceStaticLocalBlock();
		
		t1.method();
		
		
		
		
//		Local Block 
		
		{
			
			System.out.println("Local.Block 1");
			
		}
		
		{
			
			System.out.println("Local.Block 2");
		}
	}
	
	
}
