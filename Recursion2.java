// Recursion_Factorial

// Success rate: 52.31%
// Take as input n

// Print n!

// Input Format:
// Integer representing n

// Output Format:
// Integer representing n!

// Constraints:
// 1 <= n <= 10 ^ 9

// Sample test cases
// Input
// 5
// Expected output

// 120



import java.util.Scanner;

public class Recursion2 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(factorial(n));
	}

	public static int factorial(int n){
		//base code
		if(n==1){
			return 1;
		}


		//main logic

		int temp = factorial(n-1);
		return temp*n;
	}
}