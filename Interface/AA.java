package javaInterface;

public interface AA { 
	  int x = 20; 
	  void m1(); 


	  } 
	 interface BB 
	{ 
	  int y = 20; 
	  void m2(); 
	 } 
	 class CC implements AA, BB { 

	 public void m1()
	 { 
	   System.out.println("Value of x: " +x); 
	   System.out.println("m1 method"); 
	  } 
	public void m2()
	{ 
	   System.out.println("Value of y: " +y); 
	   System.out.println("m2 method"); 
	 } 
	} 
	 class MyClassInterface
	{ 
	  public static void main(String [] args)
	  { 
	    CC c = new CC(); 
	     c.m1(); 
	     c.m2(); 
	  } 
	}