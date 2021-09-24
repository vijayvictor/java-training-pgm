package org.Assignment2.net;

import java.util.Scanner;

public class OctalDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("enter octal number : ");
		String onum = sc.nextLine();
		sc.close();
		int num = Integer.parseInt(onum,8);
		System.out.println(" Octal " +onum+ " is converted into Decimal : " +num);
	}

}
