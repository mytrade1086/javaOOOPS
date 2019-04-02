package com.javapgms;

public class Armstrong {
	
	
	// 153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
	
	 public static void main(String[] args) {

	        int number = 371, originalNumber, remainder, result = 0;

	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }

}
