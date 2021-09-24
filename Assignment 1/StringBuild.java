package org.Assignments.net;

//Class of ReverseString
class StringBuild {
	public static void main(String[] args)
	{
		String input = "rest of the world";

		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(input);

		// reverse StringBuilder input1
		input1.reverse();

		// print reversed String
		System.out.println(input1);
	}
}
