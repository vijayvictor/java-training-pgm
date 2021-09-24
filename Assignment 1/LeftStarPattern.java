package org.Assignments.net;

import java.util.Scanner;

public class LeftStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("enter no of rows : ");
		int row = sc.nextInt();
		sc.close();
		
		int i, j;      
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=2*(row-i); j>=0; j--)         
		{  
		//prints space between two stars      
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		}   
		}  
