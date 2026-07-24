package Array;

/*
 
Q7.Count total no of capital words a given String?
Q8.Count total no of Proper words a given String?
 
 */

public class StringShort {

//	Q1.Count total no of alphabets from a given String?

	public static void CountAlphaOfAstring(String str) {

		System.out.println("This is the number of Charector in String !");

		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch != ' ') {
				count++;
			}
		}
		System.out.println("Number of Charactor : " + count);
		System.out.println("------------------------------------------------------------");

	}

//	Q2.Count total no of vowels from a given String?

	public static void CountVowelOfAstring(String str) {

		System.out.println("This is the number of Vowels into the given String !");

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				count++;

			}
		}
		System.out.println("Number of Vowels : " + count);
		System.out.println("------------------------------------------------------------");

	}
	
//	Q3.Count total no of small letters from a given String?

	public static void CountSmalOfAstring(String str) {
		
		System.out.println("This is a Collection of Small character into the given String !");
		
		int count = 0 ;
		
		for(int i =0 ; i < str.length() ; i++) {
			
			char ch = str.charAt(i);
			for(char j = 'a' ; j<='z';j++) {
				
				if(ch == j) {
				
				count++;
				}
			}
		}
		System.out.println("Number of small Charecter : "+count);
		System.out.println("------------------------------------------------------------");

	}
		
//	Q4.Count total no of capital letters a given String?

	public static void CountCapitalOfAstring(String str) {
		
		System.out.println("This is a Collection of Small Charecter into the goven String !");
		
		int count = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			char ch = str.charAt(i);
			
			for(char j ='A' ; j<='Z' ;j++ ) {
				
				if(ch==j) {
					count++;
				}
			}
		}
		System.out.println("Number of Capital Charecter : "+count);
		System.out.println("------------------------------------------------------------");

	}
	
//	Q5.Count total no of words a given String?

	
	public static void CountWordOfAstring(String str) {
		System.out.println("This is a Collection of Words into the String !");
		int count =0 ;
		
		for(int i = 0 ; i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(ch==' ') {
				count++;				
			}
		}
		System.out.println("Number of words : "+count);
		System.out.println("------------------------------------------------------------");

	}

//	Q6.Count total no of small words a given String?
	
	public static void CountSmalWordsOfAstring(String str) {
		
		System.out.println("This is a Collection of word into the String !");
		int count =0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			char ch = str.charAt(i);
			
			for(char j = 'a' ; j<='z';j++) {
				
				if(ch >='a' && ch <= 'z' ) {
					
					count++;
					
				}
			}		
		}
		System.out.println(count);		
		System.out.println("------------------------------------------------------------");

				
	}

	
	
	public static void main(String[] args) {

		String str = "Hello it's Java Full Stack Developement Program";

		CountAlphaOfAstring(str);
		CountVowelOfAstring(str);
		CountSmalOfAstring(str);
		CountCapitalOfAstring(str);
		CountWordOfAstring(str);
		CountSmalWordsOfAstring(str);
	}

}
