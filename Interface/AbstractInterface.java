package javaInterface;

public abstract class AbstractInterface { // Two keyword used: Abstract & class. 


    int a; 
    final int b = 20; 
    static int c = 30; 


   abstract void m1(); 
   static void m2()
   { 
      System.out.println("Static method in abstract class"); 
   } 

   void m3() { 
     System.out.println("Instance method in abstract class"); 
    } 

    AbstractInterface()
    { 
      int a = 10; 
      System.out.println("Value of a; "+a); 
    } 

   static { 
      System.out.println("Static block in abstract class"); 
   } 
  { 
    System.out.println("Instance block in abstract class"); 
  } 

   @SuppressWarnings("unused")
private void m4()
   { 
      System.out.println("Private method"); 
    } 
   protected void m5()
   { 
     System.out.println("Protected method"); 
   } 
} 
 class A extends AbstractInterface 
{ 
  void m1()
  { 
     System.out.println("Implementation of abstract method"); 
  } 
} 
 class AbstractTest 
{ 
  public static void main(String[] args) 
  { 
    A a = new A(); 
    System.out.println("Value of b: " +a.b); 
    System.out.println("Value of c: " +AbstractInterface.c); 
     a.m1(); 
    AbstractInterface.m2(); 
     a.m3(); 
     a.m5(); 
   } 
}