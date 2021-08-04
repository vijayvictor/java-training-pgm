package javaInterface;

public interface Home 
{ 
  void homeLoan(); 
 } 
 interface Car 
{ 
  void carLoan(); 
} 
 interface Education 
{ 
  void educationLoan(); 
 } 
 class Loan implements Home, Car, Education 
{ 
// Multiple inheritance using multiple interfaces. 
  public void homeLoan() 
  { 
     System.out.println("Rate of interest on home loan is 8.5%"); 
  } 
public void carLoan()
{ 
   System.out.println("Rate of interest on car loan is 9.25%"); 
 } 
public void educationLoan()
{ 
   System.out.println("Rate of interest on education loan is 10.45%"); 
 } 
public static void main(String[] args) 
{ 
   Loan l = new Loan(); 
    l.homeLoan(); 
    l.carLoan(); 
    l.educationLoan(); 
  } 
}