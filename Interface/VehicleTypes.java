package javaInterface;

public class VehicleTypes 
{ 
  interface Vehicle 
  { 
    public int getNoOfWheels(); 
  } 
} 
 class Bus implements VehicleTypes.Vehicle 
{ 
  public int getNoOfWheels() 
  { 
      return 6; 
  } 
} 
 class bmw implements VehicleTypes.Vehicle 
{ 
  public int getNoOfWheels() 
  { 
    return 4; 
  } 
} 
 class Bike implements VehicleTypes.Vehicle
{ 
  public int getNoOfWheels()
  { 
     return 2; 
   } 
 } 
 class VehicleTest 
{ 
  public static void main(String[] args) 
  { 
    Bus b = new Bus(); 
    System.out.println(b.getNoOfWheels()); 

   bmw c = new bmw(); 
    System.out.println(c.getNoOfWheels()); 

    Bike bk = new Bike(); 
    System.out.println(bk.getNoOfWheels()); 
   } 
}