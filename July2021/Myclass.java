//package javaTP;

abstract class MyTest {
	abstract void calculate(int a, int b); // No body.
}

class Addition extends MyTest {
	@Override
	void calculate(int a, int b)
	  { 
	    int x = a + b; 
	    System.out.println("Sum:" +x); 
	   }
}

class Subtraction extends MyTest {
	@Override
	void calculate(int a, int b)
	  { 
	    int y = a - b; 
	    System.out.println("Subtract:" +y); 
	  }
}

class Multiplication extends MyTest {
	@Override
	void calculate(int a, int b)
	  { 
	    int z = a * b; 
	    System.out.println("Multiply:" +z); 
	  }
}

class Myclass {

	public static void main(String[] args) {
		Addition a = new Addition();
		Subtraction s = new Subtraction();
		Multiplication m = new Multiplication();

		a.calculate(20, 30);
		s.calculate(10, 5);
		m.calculate(10, 20);
	}
}
