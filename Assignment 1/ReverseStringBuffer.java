package org.Assignments.net;

import java.util.Scanner;

public class ReverseStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String rithu = "welcome";
		String str ;
		String reverse = "";
		
		System.out.print("enter the string here which you want: ");
		str = sc.nextLine();
		sc.close();
		int length = str.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("reverse of the string is : "+reverse);
		//StringBuffer
		StringBuffer sb = new StringBuffer("welcome to global conference meeting");
		System.out.println("reverse of the stringbuffer : " +sb.reverse());
		//StringBuilder
		StringBuilder sbd = new StringBuilder();
		sbd.append(rithu);
		sbd.reverse();
		System.out.println("reverse of the stringbuilder :" +rithu);
		
	}

}
