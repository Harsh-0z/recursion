// Recursion_IsPalindrome

// Success rate: 30.51%
// Take as input String.

// Write a Function to Check whether it is palindrome or not. if yes print true
// otherwise false. Palindrome means string and it's reversed form are same

// please Note: Lower and Upper case letter treated as equal. You have to use recursion to solve the problem.

// Input Format:
// String representing S.

// Output Format:
// print true if the string is palindrome else print false.

// Example:
// Input:
// aBcba
// output
// true

// Constraints:
// Size of String may be large.

// Sample test cases
// Input

// AbDBa
// Expected output
// false

import java.util.Scanner;

public class Recursion6 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
        String str1=str.toUpperCase();//convert the string into any case upper or lower to avoid changing results when it is compared .
		char[] ch = str1.toCharArray();
        int sp = 0;
        int ep = ch.length-1;


		System.out.println(isPalindrom(ch,sp,ep));
	}

	public static boolean isPalindrom(char[] ch,int sp,int ep){
		if(sp==ep){
            return true;//for odd size arrays 
        }
        if(sp>ep){
            return true;//for even size arrays.
        }

		//main logic

		if(ch[sp]!=ch[ep]){
			return false;
		}else{
            boolean temp = isPalindrom(ch, sp+1, ep-1);
            return temp;
        }

	}
}