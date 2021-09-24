package org.Assignment2.net;

import java.util.Scanner;

public class AddBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter B1 : ");
		long b1 = s.nextLong();
		System.out.println("Enter B2 : ");
		long b2 = s.nextLong();
		int i = 0, carry = 0;
		int sum[] = new int[10];
		s.close();
		
		//logical functions
		while(b1!=0||b2!=0)
		{
			sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
			carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
			b1 = b1 / 10;
			b2 = b2 / 10;
			}
		if (carry != 0) {
			sum[i++] = carry;
		}
		--i;
		System.out.print("Output: ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.print("\n");  
		
	}

}
