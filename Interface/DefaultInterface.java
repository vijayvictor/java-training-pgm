package javaInterface;

public interface DefaultInterface 
{ 
 void m1(); 
 default void m2()// Default method so we do not need to implement it in implementation class.
 { 
   System.out.println("default method"); 
  } 
} 
 class DI implements DefaultInterface 
{ 
  public void m1()// Implementing abstract method inside implementation class.
  { 
     System.out.println("m1-AA"); 
  } 
public static void main(String[] args) 
{ 
   DefaultInterface obj = new DI(); 
    obj.m1(); 
    obj.m2(); 
  } 
}