// Recursion_Fibonacci number

// Success rate: 56.80%
// Take as input a number n.
// Print the nth number of Fibonacci sequence where
// 0th Fibonacci is 0 and 1st Fibonacci is 1. Here is a sample
// 0 1 1 2 3 5 8 13 21 34 55

// Input Format:
// Integer

// Output Format:
// Integer

// Constraints:
// n <= 10 ^ 9

// Sample test cases
// Input

// 6
// Expected output
// 8



import java.util.Scanner;
public class Recursion3 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fibonacci(n));
	}

	public static int fibonacci(int n){
		//base case
		if(n==1 || n==0){
			return n;
		}

		// main logic

		int temp1 = fibonacci(n-1);
		int temp2 = fibonacci(n-2);

		return temp1+temp2;

		
	}
}