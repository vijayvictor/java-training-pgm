package javaInterface;


public interface Ainf 
{ 
  void msg(); // No body. 
} 
 class B implements Ainf 
{ 
 // Override method declared in interface. 
    public void msg()
    { 
      System.out.println("Hello Java"); 
    } 
 void show()
 { 
    System.out.println("Welcome you"); 
  } 
public static void main(String[] args) 
{ 
   B b = new B(); 
    b.msg(); 
    b.show(); // A reference of interface is pointing to objects of class B. 
    
   Ainf a = new B(); 
    a.msg(); 
 // a.show(); // Compile-time error because a reference of interface can only call methods declared in it and implemented by implementing class. 
// show() method is not part of interface. It is part of class B. When you will call this method, the compiler will give a compile-time error. It can only be called when you create an object reference of class B. 
   }
 }