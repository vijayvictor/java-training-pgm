package javaInterface;

public class ClassTest 
{ 
  public int a = 20; 
  int b = 30; 
  protected int c = 30; 
  @SuppressWarnings("unused")
private int d = 40; 

void m1()
{ 

   System.out.println("Methods have a body"); 
 } 

   ClassTest()
   { 
     System.out.println("Constructor in class"); 
   } 
} 
 class Myclass extends ClassTest 
{ 
  private void m2()
  { 
    System.out.println("Single level inheritance"); 
  } 
public static void main(String[] args) 
{ 
   Myclass mc = new Myclass(); 
   System.out.println("Value of a: " +mc.a); 
   System.out.println("Value of b: " +mc.b); 
   System.out.println("Value of c: " +mc.c); 

     mc.m1(); 
     mc.m2(); 
  } 
}