package org.Assignment3.net;
// methodoverloading using data types
public class DatatypeMethodOverloading {

	static int add(int a, int b) {return a + b;}
	static int add(int a, int b, int c) { return a+b+c;}
	static long mul(long a, long b) { return a*b;}
	static float div(float a , float b) { return a/b;}
	static double sub(double a, double b) { return a - b;}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("2 Integer : " +DatatypeMethodOverloading.add(2, 4));
    System.out.println("3 Integer : " +DatatypeMethodOverloading.add(4, 5, 6));
    System.out.println("Long      : " +DatatypeMethodOverloading.add(255, 299));
    System.out.println("Float     : " +DatatypeMethodOverloading.add(66, 4));
    System.out.println("Double    : " +DatatypeMethodOverloading.add(25, 11));
    
	}

}
