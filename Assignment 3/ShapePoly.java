package org.Assignment3.net;

class ShapePoly{  
void draw()
{
	System.out.println("drawing...");
	}  
}  
class Rectangle extends ShapePoly
{  
void draw()
{
	System.out.println("drawing rectangle...");
	}  
}  
class Circle extends ShapePoly
{  
void draw()
{
	System.out.println("drawing circle...");}  
}  
class Triangle extends ShapePoly
{  
void draw()
{System.out.println("drawing triangle...");}  
}  
class ShapePolymorphism2{  
public static void main(String args[]){  
ShapePoly s;  
s=new Rectangle();  
s.draw();  
s=new Circle();  
s.draw();  
s=new Triangle();  
s.draw();  
}  
}  