package javaInterface;

public class Cube 
{ 
  protected interface Number 
  { 
    public void calculateCube(int n); 
   } 
} 
 class Five implements Cube.Number 
{ 
  public void calculateCube(int n)
  { 
    int cubeN = n * n * n; 
    System.out.println("Cube of 5: " +cubeN); 
   } 
} 
 class Ten implements Cube.Number 
{ 
  public void calculateCube(int n)
  { 
    int cubeN = n * n * n; 
    System.out.println("Cube of 10: " +cubeN); 
   } 
} 
 class CubeTest 
{ 
  public static void main(String[] args) 
  { 
    Five f = new Five(); 
     f.calculateCube(5); 

    Ten t = new Ten(); 
     t.calculateCube(10); 
  } 
}