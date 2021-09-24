package org.Assignments.net;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("enter no of rows : ");
		int row = sc.nextInt();
		sc.close();
		
		for(int i=1; i<row;i++)
		{
			for(int j=1;j<=i;j++) 
			{
			System.out.print("*");	
			}
			System.out.println();	
			
		}
	}

}
