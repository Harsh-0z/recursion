// Recursion_Sum

// Success rate: 41.44%
// Take as input n

// Print sum of n natural numbers using recursion

// Input Format:
// Integer representing n

// Output Format:
// Integer representing sum of N Natural numbers

// Constraints:
// 1 <= n <= 10 ^ 9

// Sample test cases
// Input

// 4
// Expected output
// 10



import java.util.Scanner;

public class Recursion1{
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.println(sum(x));
	}
	public static int sum(int n){ //FAITH
		if(n==1){  // BASE CASE
			return 1;
		}
		//faith,mainlogic,basecase.

		int temp = sum(n-1);//MAIN LOGIC
		return temp+n; 

	}
}