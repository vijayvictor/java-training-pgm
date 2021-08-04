package javaInterface;

public abstract class AbstractClass 
{ 
  int x = 10; // Data member. 
  AbstractClass()//constructor
  { 
    System.out.println("AbstractClass constructor"); 
  } 
final void m1()//final method
{ 
   System.out.println("Final method"); 
 } 
void m2()
{ 
   System.out.println("Instance method"); 
 } 
static void m3()//static method
{ 
   System.out.println("Static method"); 
 } 
  abstract void msg(); //abstract method and doesn't have body
 } 
 class AbsTest extends AbstractClass 
{ 
  AbsTest()//constructor
  { 
     System.out.println("AbsTest class constructor"); 
   } 
 void msg()
 { 
    System.out.println("Hello Java"); 
 } 
public static void main(String[] args) 
{ 
   AbsTest t = new AbsTest(); 
    t.msg(); 
    t.m1(); 
    t.m2(); 
    m3(); 
   System.out.println("x = " +t.x); 
  } 
}