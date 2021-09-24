package org.Assignment3.net;

class BankOverridding{  
 int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends BankOverridding{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends BankOverridding{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends BankOverridding{  
int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  
class Test2{  
public static void main(String args[]){  
BankOverridding bor =new BankOverridding();
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("Bank Rate of Interest Modelview: "+bor.getRateOfInterest()+"%");  
System.out.println("SBI Rate of Interest   : "+s.getRateOfInterest()+"%");  
System.out.println("ICICI Rate of Interest : "+i.getRateOfInterest()+"%");  
System.out.println("AXIS Rate of Interest  : "+a.getRateOfInterest()+"%");  
}  
}  