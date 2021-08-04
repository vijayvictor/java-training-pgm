package javaInterface;

public abstract class Hello 
{ 
// Declaration of instance method. 
  public void msg1() 
  { 
    System.out.println("msg1-Hello"); 
  } 
  abstract public void msg2(); 
} 
 class Test extends Hello 
{ 
// Overriding abstract method. 
  public void msg2() 
  { 
    System.out.println("msg2-Test"); 
  } 
public static void main(String[] args)
{ 
// Creating object of subclass Test. 
   Test obj = new Test(); 
    obj.msg1(); 
    obj.msg2(); 
  } 
}