// Recursion_Smart Power

// Success rate: 24.31%
// Given two Integer a and n, find a^n (a raise to power n).

// Note: Use Recursion and Expected Time complexity is O(logN).

// Input Format:
// Single line contains 2 integers a and n

// Output Format:
// Return the answer a^n

// Constraints:
// 1<= a <= 10
// 1<= n <= 18

// Sample test cases
// Input

// 2
// 10
// Expected output
// 1024


import java.util.Scanner;

public class Recursion5 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int n = s.nextInt();

		System.out.println(smartPower(a,n));
	}

	public static long smartPower(int a, int n){
		//base case 
		// here base case is a^1 = a.
		if(n==1){
			return a;
		}



		long temp = smartPower(a,n/2);
		if(n%2==0){
			return temp*temp;
		}else{
			return temp*temp*a;
		}
	}
}