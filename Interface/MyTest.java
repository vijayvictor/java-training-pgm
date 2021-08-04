	package javaInterface;

public abstract class MyTest 
{
	abstract void calculate(int a, int b); // No body. 
} 
 class Addition extends MyTest 
{ 
 void calculate(int a, int b)
 { 
   int x = a + b; 
   System.out.println("Addition:" +x); 
  } 
} 
class Subtraction extends MyTest 
{ 
 void calculate(int a, int b)
 { 
   int y = a - b; 
   System.out.println("Subtract:" +y); 
 } 
} 
class Multiplication extends MyTest 
{ 
 void calculate(int a, int b)
 { 
   int z = a * b; 
   System.out.println("Multiply:" +z); 
 } 
} 
 /**
 * @author welcome
 *
 */
class MyClass 
{ 
public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Addition a = new Addition(); 
		   Subtraction s = new Subtraction(); 
		   Multiplication m = new Multiplication(); 
		    
		    a.calculate(20, 30); 
		    s.calculate(10, 5); 
		    m.calculate(10, 20); 
	}

}
