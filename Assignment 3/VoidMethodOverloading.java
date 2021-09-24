package org.Assignment3.net;

public class VoidMethodOverloading {
	
	void sum(int a, int b)
	{
		System.out.println("addition : " +(a+b));
	}
    void sum(long a, long b, long c)
    {
    	System.out.println("Multiply : " +(a*b*c));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidMethodOverloading vml = new VoidMethodOverloading();
		vml.sum(11,22);
		vml.sum(11,22,33);
	}

}
