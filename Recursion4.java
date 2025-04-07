// Recursion_Print Increasing

// Success rate: 44.44%
// Take as input N

// Print numbers from 1 to N in N lines

// Input Format:
// Integer representing n

// Output Format:
// Print numbers from 1 to N

// Constraints:
// 1 <= n <= 10 ^ 9

// Sample test cases
// Input

// 6
// Expected output
// 1
// 2
// 3
// 4
// 5
// 6


import java.util.Scanner;

public class Recursion4 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();

		printincrease(n);
	}
	public static void printincrease(int n){
		if(n==1){
			System.out.println(1);
			return;
		}

		printincrease(n-1);
		System.out.println(n);
		return;

	}
}