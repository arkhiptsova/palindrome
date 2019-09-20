package FeetNumber;

import java.util.Scanner;

/*
Mila 
This program that prompts the user to enter a three-digit integer 
and determines whether it is a palindrome integer.  An integer is 
palindrome if it reads the same from right to left and from left 
to right.  A negative integer is treated the same as a positive integer. 
palindrome.java
*/

public class palindrome {
	
	public static void main(String args[]) { 
		Scanner input = new Scanner (System.in)	;
		System.out.println("Enter a three-digit integer"); //ask a user for a number 
        int palindrome = input.nextInt(); 
        if(isPalindrome(palindrome)){ //ef else statement to check the number palindrome or not
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }
	     
        
    }
  
  
     //Java method to check if number is palindrome or not
   
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) { //while loop to check its a number , not a zero
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

}
