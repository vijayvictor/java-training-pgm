package javaInterface;

public abstract class AbsClass {
	
	 // No abstract method here. 
	} 
	// Creating a subclass that inherits Abstract class. 
	 class Subclass extends AbsClass 
	{ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbsClass ac = new AbsClass(); // Compile-time error. 
	}

}
