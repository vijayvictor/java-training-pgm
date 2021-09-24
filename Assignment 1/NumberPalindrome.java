package org.Assignments.net;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp= new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int num= inp.nextInt();
	  
	    int reverse=0, element, remainder; 
	    element = num;
	    inp.close();
	    
	    while(num!=0){
	      remainder= num % 10;
	      reverse = (reverse * 10) + remainder;
	      num = num / 10;
	    }
	  
	    if (element == reverse){
	      System.out.println("Yes, it is palindrome");
	    }
	    else{
	      System.out.println("No, it is not palindrome");
	}
	}

}
