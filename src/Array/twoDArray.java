package Array;

import java.util.Scanner;

public class twoDArray {

//	Q1. WAP to input and display element of SDA size 15.

	public static void takeArray(int arr[][]) {

		System.out.println("Enter the elements of an array ...........");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print("Enter the element at index [" + i + " ]" + "[ " + j + " ]");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("--------------------------------------------------------");
	}

	public static void printOfAnarray(int arr[][]) {

		System.out.println("It's your input array......................");

//		System.out.print("[ ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
//		System.out.print("]\n");

		System.out.println("---------------------------------------------------------");

	}

//	Q2. WAP to add all elements of SDA size 12.

	public static void sumOfAnarray(int arr[][]) {

		System.out.println("It's sum of all elements.................");

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];
			}
		}
		System.out.println(sum);
		System.out.println("---------------------------------------------------------");
	}

//	Q3. WAP to multiply all elements in SDA size 8.

	public static void mulOfAnarray(int arr[][]) {

		System.out.println("It's multiplication of all elements in array....");
		int mul = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				mul *= arr[i][j];
			}

		}
		System.out.println(mul);
		System.out.println("-----------------------------------------------------------");
	}

//	Q4. WAP to display square of all elements in SDA size 8.

	public static void sqrOfAnarray(int arr[][]) {

		System.out.println("It's sqare of all elements in array...............");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = arr[i][j] * arr[i][j];
			}
		}
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i][j] + " ");
		}
		System.out.println("]");
		System.out.println("--------------------------------------------------------");

	}

//	Q5. WAP to display all elements evens position of SDA size 8.

	public static void evenPosOfAnarray(int arr[][]) {

		System.out.println("These elements even postion in array.............");

		System.out.print("[ ");
		for (int i = 0; i < arr.length; i += 2) {

			System.out.print("arr[ " + i + " ]: " + arr[i] + " ");
		}
		System.out.print("]\n");
		System.out.println("--------------------------------------------------------");
	}

//	Q6. WAP to display all elements odd position of SDA size 8.

	public static void oddPosOfAnarray(int arr[]) {

		System.out.println("These elements odd postion in array.............");

		System.out.print("[ ");
		for (int i = 1; i < arr.length; i += 2) {

			System.out.print("arr[ " + i + " ]: " + arr[i] + " ");
		}
		System.out.print("]\n");
		System.out.println("--------------------------------------------------------");
	}

//	Q7. WAP replace all elements by their square of SDA size 8.

	public static void replaceSqrOFAnarray(int arr[]) {

		System.out.println("It's collection squire elements of an array.......");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = arr[i] * arr[i];
		}

		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println("\n--------------------------------------------------------");

	}

//	Q8. WAP replace all even elements by their square of SDA size 8.

	public static void evenSqreOfAnarray(int arr[]) {

		System.out.println("It's a collection of all even elements by there square..");

		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {

				System.out.print(arr[i] * arr[i] + " ");
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("]");
		System.out.println("\n--------------------------------------------------------");
	}

//	Q9. WAP replace all odd elements by their square of SDA size 8.

	public static void oddSqreOfAnarray(int arr[]) {

		System.out.println("It's a collection of all odd elements by there square..");

		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {

				System.out.print(arr[i] * arr[i] + " ");
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("]");
		System.out.println("\n--------------------------------------------------------");
	}

//	Q10. WAP to multiply even by 2 and odd by 3 and odd by 3 in SDA size 8.

	public static void oddCubeOfAnarray(int arr[]) {

		System.out.println("It's a collection of all odd elements by there square..");

		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {

				System.out.print(arr[i] * arr[i] * arr[i] + " ");
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("]");
		System.out.println("\n--------------------------------------------------------");
	}

//	Q11. WAP to find | Count even and odd elements in SDA size 8.

	public static void evenOddOfAnarray(int arr[]) {
		System.out.println("This is a conditional based array.........");

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {

				arr[i] = arr[i] * 2;

			} else {

				arr[i] = arr[i] * 3;

			}
		}

//		printOfAnarray(arr);
	}

// Q1.0. WAP to count all even and odd elements of SDA size 8.

	public static void countevenOddOfAnarray(int arr[]) {

		System.out.println("It's a collection of Number of odd & even in array..");

		int even = 0, odd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Number of even elements in array :  " + even);

		System.out.println("Number of odd elements in array : " + odd);
		System.out.println("--------------------------------------------------------");

	}

	// Q1. WAP to add all even and odd elements of SDA size 8.

	public static void addEvenOddOfAnarray(int arr[]) {

		System.out.println("These are addition of odd & even elements in array.....");

		int evenSum = 0, oddSum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];

			}
		}
		System.out.println("Addition of even elements in array :  " + evenSum);

		System.out.println("Addition of odd elements in array : " + oddSum);
		System.out.println("--------------------------------------------------------");

	}

//	Q2. WAP to replace even by 0 off by 1  elements in SDA size 5.

	public static void replaceByOfAnarray(int arr[]) {

		System.out.println("This array replaced by 0 & 1 in array.....");

		int evenSum = 0, oddSum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				arr[i] = 0;
			} else {
				arr[i] = 1;

			}
		}

//		printOfAnarray(arr);

	}

//	Q3. WAP to find | Count an element in SDA size 8. 

	public static void findOfAnarray(int arr[], int target) {

		System.out.println("It's my target element......");

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				System.out.println("Target element is present at indx [ " + i + " ] : " + target);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Not found !!");
		}

		System.out.println("\n--------------------------------------------------------");
	}

	// Q4. WAP to replace an element in SDA by 0 size 8.

	public static void replaceTargetOfAnarray(int arr[], int target) {

		System.out.println("It's you updated array...............");

		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				arr[i] = 0;
			}

			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
		System.out.println("\n----------------------------------------------------------------");

	}

//	Q5. WAP to change the search elements size 8.

	public static void replaceEleOfAnarray(int arr[], int target, int num1) {
		System.out.println("It's you updated array...............");

		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				arr[i] = num1;
			}

			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
		System.out.println("\n----------------------------------------------------------------");

	}

//	Q6. WAP to find prime no. in SDA elements size 8.

	public static boolean isPrime(int num) {

		if (num <= 1) {

			return false;
		}
//		Math.sqrt(num);
//		num -1 
//		num /2

		for (int i = 2; i <= num / 2; i++) {

			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

//	Q7. WAP to count prime no. in SDA elements size 8.

	public static void countPrimeOfAnarray(int arr[]) {

		System.out.println("This is number of prime value in array...........");

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				System.out.println(arr[i] + " is prime !");
				count++;
			}
		}
		System.out.println("Total number of prime : " + count);
		System.out.println("----------------------------------------------------------------");
	}

//	Q8. 	

	public static void replacePrimeOfAnarray(int arr[]) {

		for (int i = 1; i < arr.length; i++) {

			if (isPrime(arr[i])) {
				arr[i] = 0;
			}
		}
		System.out.println("It's updated array by given array.....");
//		printOfAnarray(arr);

	}

	public static void sumPrimeOfAnarray(int arr[]) {

		System.out.println("It's sum of all prime number in array........ ");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				sum += arr[i];
			}
		}
		System.out.println("Sum of Prime Number : " + sum);
		System.out.println("----------------------------------------------------------------");
	}

	public static void revirseOfAnarray(int arr[]) {

		System.out.println("It's reverse collection of an array......");

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
//		printOfAnarray(arr);
	}

	public static void reverseNoActOfAnarray(int arr[][]) {

		System.out.print("[ ");

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("]");
		System.out.println("\n----------------------------------------------------------------");

	}

	public static void main(String[] args) {

//		Tap or Tadap

		System.out.print("Please Enter the size of an array : ");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[][] = new int[n][m];

		takeArray(arr);
		printOfAnarray(arr);
//		sumOfAnarray(arr);
//		mulOfAnarray(arr);
//		sqrOfAnarray(arr);
//		evenPosOfAnarray(arr);
//		oddPosOfAnarray(arr);
//		replaceOFAnarray(arr);
//		evenSqreOfAnarray(arr);
//		oddSqreOfAnarray(arr);
//		oddSqreOfAnarray(arr);
//		oddCubeOfAnarray(arr);
//		evenOddOfAnarray(arr);
//		countevenOddOfAnarray(arr);
//		addEvenOddOfAnarray(arr);
//		replaceByOfAnarray(arr);

//		System.out.print("Enter a target element : ");
//		int m = sc.nextInt();
//		findOfAnarray(arr, m);

//		--------------------------------------------------------------------

//		System.out.print("Enter the required element replaced by 0 : ");
//		int target = sc.nextInt();

//		replaceTargetOfAnarray(arr, target);

//		System.out.print("Please enter a replaced element: ");
//		int num1 = sc.nextInt();
//		replaceEleOfAnarray(arr, target, num1);
//		countPrimeOfAnarray(arr);

//		replacePrimeOfAnarray(arr);
//		sumPrimeOfAnarray(arr);

//		revirseOfAnarray(arr);
//		reverseNoActOfAnarray(arr);

	}

}
