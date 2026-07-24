package AdvanceJava;


public class StaticInstanceLocalBlock {
	
	int age ; 
	static String name ;
	
	
//	instance blocks
	
	{
		
		System.out.println("StaticInstanceLocalBlock.Block_Ai");
	}
	
	{
		System.out.println("StaticInstanceLocalBlock.Block_Bi");
		
	}
		
//	Create a constructor -----------------------------------
	
	public StaticInstanceLocalBlock() {
		System.out.println("Constructore.Block-------------------");
	}
	
//	Static block 
	
	static{
		
		System.out.println("StaticInstanceLocalBlock.Block_Bs");
		
	}
	
	static{
		
		System.out.println("StaticInstanceLocalBlock.Block_As");
	}
	
	
	
	public static void main(String[] args) {
		
		StaticInstanceLocalBlock t1 = new StaticInstanceLocalBlock();
		
				
//		Local Block 
		
		{
			
			System.out.println("StaticInstanceLocalBlock.Block_Bl");

		}
		
		{
			
			System.out.println("StaticInstanceLocalBlock.Block_Al");

		}
		
	}
	
	
}
