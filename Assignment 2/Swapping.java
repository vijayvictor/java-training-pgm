package org.Assignment2.net;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Before Swapping........ ");
		System.out.print("Enter value of A : ");
		int a = sc.nextInt();
		
		System.out.print("Enter value of B : ");
		int b = sc.nextInt();
		sc.close();
		
		int t;
		
		t = a ;
		a = b;
		b = t;
		System.out.println();
		System.out.println("After Swapping....... ");
		
		System.out.println("Value of A is : "+a);
		System.out.println("Value of B is : "+b);
		
		
	}

}
