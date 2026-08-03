package Array;

import java.util.Scanner;

public class Day_1 { 

// Q1. WAP to input and display element of SDA size 15.

//	Create a funtion for get input the elements of an array by the user

	public static void takeAnarray(int arr[]) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			System.out.print("Enter the elements of an array[" + i + "] : ");
			arr[i] = sc.nextInt();

		}
		
	}

//	For print the elements of an array 

	public static void printAnarray(int arr[]) {

		System.err.println("Print the all elements of an array...............");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i] + " ");
		}
	}

// Q2. WAP to add all elements of SDA Size 8.

	public static void sumOfAnarray(int arr[]) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}

		System.out.println("The sum of all elemets of an array : " + sum);
	}

//	Q3. WAP to multiply all element of SDA size 12

	public static void mulOfAnarray(int arr[]) {

		int mul = 1;

		for (int i = 0; i < arr.length; i++) {

			mul *= arr[i];
		}
		System.err.println("Multiplication of all elements  : " + mul);
	}

	
//	Q4. WAP to displays square of all elements in SDA size 8 
	
	public static void squareOfAnarray(int arr[]) {

		System.out.println("Sqare of an array elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+ arr[i]*arr[i]+" ");
			
		}
		System.out.println();
	}
	
	
//	Q5. WAP to display all elements even position of SDA size 8.
	
	public static void evenOfAnarray(int arr[]) {
		
		System.out.println("Even postion of an array elements ..............");
		
		for(int i = 0 ; i< arr.length ; i+=2) {
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
	}
	
	
//	Q6. WAP to display all elements of position of SDA size 8.
	
	public static void oddPositionAnarray(int arr[]) {
		
		System.out.println("Odd postion of an array elements");
		
		for(int i = 1 ; i <= arr.length ; i+=2) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
//	Q7. WAP replace all elements by their square of SDA  size 8.
	
	
	public static void replaceSqrArray(int arr[]) {
		
		
		System.out.println("Replace the given array to after the sqr elements of an array ........... ");
		
		
		
		for(int i = 0 ; i< arr.length ; i++) {
			
			arr[i] = arr[i] * arr[i];
		}
		
		
		
		for(int i = 0 ; i< arr.length ; i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	
	}
	
	
	
	
	
	
	
	
//	-----------------------------------------------------------------------
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of an array : ");

		int n = sc.nextInt();

		int Actualarr[] = new int[n];

		takeAnarray(Actualarr);
		System.out.println("---------------------------------------------------------");

		printAnarray(Actualarr);

		System.out.println("\n---------------------------------------------------------");

		sumOfAnarray(Actualarr);
		System.out.println("---------------------------------------------------------\n");

		mulOfAnarray(Actualarr);
		System.out.println("---------------------------------------------------------");
		
		squareOfAnarray(Actualarr);
		System.out.println("---------------------------------------------------------\n");
		
		evenOfAnarray(Actualarr);
		System.out.println("---------------------------------------------------------\n");
		
		oddPositionAnarray(Actualarr);
//		System.out.println("---------------------------------------------------------");
//
//		replaceSqrArray(Actualarr);
//		System.out.println("---------------------------------------------------------");



	}

}