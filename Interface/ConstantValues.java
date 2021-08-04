package javaInterface;

public interface ConstantValues 
{ 
// Declaration of interface variables. 
   int x = 20; 
   int y = 30; 
 } 
 class Add implements ConstantValues 
{ 
  int a = x; 
  int b = y; 
 void m1()
 { 
   System.out.println("Value of a: " +a); 
   System.out.println("Value of b: " +b); 
  } 
void sum()
{ 
  int s = x + y; 
  System.out.println("Sum: " +s); 
 } 
} 
 class Sub implements ConstantValues 
{ 
  void sub()
  { 
    int p = y - x; 
    System.out.println("Sub: " +p); 
  } 
} 
 class Test1 
{ 
  public static void main(String[] args) 
  { 
    Add a = new Add(); 
     a.m1(); 
     a.sum(); 
   Sub s = new Sub(); 
     s.sub(); 
   } 
}
