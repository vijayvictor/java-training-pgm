package javaInterface;
//MIULTILEVEL INHERITANCE USING INTERFACE
public interface Continent 
{ 
  void showContinent(); 
 } 
 interface Country 
{ 
  void showCountry(); 
 } 
 interface State 
{ 
  void showState(); 
} 
 class City implements State
{ 
  public void showContinent()
  { 
    System.out.println("United States"); 
  } 
public void showCountry()
{ 
  System.out.println("America"); 
 } 
public void showState()
{ 
   System.out.println("Texas"); 
 } 
void showCity()
{ 
  System.out.println("Irvin"); 
 } 
public static void main(String[] args) 
{ 
  City c = new City(); 
   c.showContinent(); 
   c.showCountry(); 
   c.showState(); 
   c.showCity(); 
  } 
}