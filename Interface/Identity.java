package javaInterface;

public abstract class Identity 
{ 
  abstract void getName(String name); 
  abstract void getGender(String gender); 
  abstract void getCity(String city); 
  abstract void getCountry(String country);
} 
class Person extends Identity 
{ 
  void getName(String name) 
  { 
    System.out.println("Name : " +name); 
  } 
void getGender(String gender) 
{ 
  System.out.println("Gender : " +gender); 
} 
void getCity(String city)
{ 
  System.out.println("City   : " +city); 
} 
// Newly added method in subclass. 
  void getCountry(String country)
  { 
    System.out.println("Country   : " +country); 
   } 
 } 
 class Mainclass 
{ 
  public static void main(String[] args) 
  { 
// Declaring abstract class reference equal to subclass objects. 
    Identity i = new Person(); 
     i.getName("DEEPAK"); 
     i.getGender("MALE"); 
     i.getCity("DHANBAD"); 
     i.getCountry("INDIA"); // Compile-time error because we cannot access newly added method in subclass using superclass reference. 
  } 
}