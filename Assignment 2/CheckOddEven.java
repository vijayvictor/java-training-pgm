package org.Assignment2.net;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.print("enter number : ");
		int num = scr.nextInt();
		scr.close();
		
		if(num%2==0)
		{
			System.out.println(num+ " is even");
		}
		else
		{
		System.out.println(num+ " is odd");
	}
  }

}
