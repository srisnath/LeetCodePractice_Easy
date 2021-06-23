package easy;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 
 * 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0
 

Constraints:

-2^31 <= x <= 2^31 - 1
 * 
 * Solution Date : 20-06-2021
 * 
 * */

public class ReverseInteger {
	
	 public int reverse(int x) {
		 long returnValue = 0;
		 while(x != 0) {
			 returnValue = x%10 + returnValue*10;
			 x = x / 10;
		 }
		 if(!(returnValue > Integer.MIN_VALUE && returnValue < Integer.MAX_VALUE)) {
			 return 0;
		 }
		 return (int) returnValue;
	 }

	public static void main(String[] args) {
		ReverseInteger reverse = new ReverseInteger();
		System.out.println(reverse.reverse(1534236469));
	}
}


/**
 * STATUS ::: SOLVED
 * */
