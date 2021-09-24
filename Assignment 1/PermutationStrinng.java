package org.Assignments.net;

import java.util.*;

class Permutation
{

static void permute(String s , String answer)
{
	if (s.length() == 0)
	{
		System.out.print("\n" +answer + " ");
		return;
	}
	
	for(int i = 0 ;i < s.length(); i++)
	{
		char ch = s.charAt(i);
		String left_substr = s.substring(0, i);
		String right_substr = s.substring(i + 1);
		String rest = left_substr + right_substr;
		permute(rest, answer + ch);
	}
}

// Driver code
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	
	String s;
	String answer="";
	
	System.out.print("Enter the string : ");
	s = scan.next();
	System.out.println(s.length());
	//System.out.println(String.valueOf(answer));
	//answer.length();
	System.out.print("\nAll possible strings are : ");
	permute(s, answer);
	scan.close();
}
}

// This code is contributed by adityapande88
