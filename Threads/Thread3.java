package javathread;

interface A
{
    void myMethod();
}
 
class B
{
    public void myMethod()
    {
        System.out.println("My Method");
    }
}
 
class C extends B implements A
{
     
}
 
class Thread3
{
    public static void main(String[] args) 
    {
        A a = new C();
         
        a.myMethod();
    }
}