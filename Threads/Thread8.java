package javathread;

	// Two threads performing two tasks at a time.
	public class Thread8 extends Thread
	{
	// Declare a String variable to represent task.
	  String task;
	 
	Thread8(String task)
	{
	  this.task = task;
	}
	public void run()
	{
	 for(int i = 1; i <= 5; i++)
	 {
	  System.out.println(task+ " : " +i); 	
	  try
	 {
	    Thread.sleep(1000); // Pause the thread execution for 1000 milliseconds.
	 }
	 catch(InterruptedException ie) {
	   System.out.println(ie.getMessage());	
	  }
	 } // end of for loop.
	} // end of run() method.
	public static void main(String[] args) 
	{
	// Create two objects to represent two tasks.
	  Thread8 th1 = new Thread8("Cut the ticket"); // Passing task as an argument to its constructor.
	  Thread8 th2 = new Thread8("Show your seat number");
	  
	// Create two objects of Thread class and pass two objects as parameter to constructor of Thread class.
	  Thread t1 = new Thread(th1);
	  Thread t2 = new Thread(th2);
	  t1.start();
	  t2.start();
	  }
	}