package javathread;

class Thread2 implements Runnable {

	private String name ;
	private int delay ;

	public Thread2 ( String name, int delay ) {
	    this.name = name ;
	    this.delay = delay ;
	}

	public void run ( ) {
	   for ( int i = 0; i < 5; i++ ) {
	      System.out.println ( name + ": " + i ) ;
	      try {
	          Thread.sleep ( delay ) ;
	      } catch ( InterruptedException e ) {
	         e.printStackTrace();
	      }
	   }
	}

	    public static void main(String[] args) {
	        Runnable r1 = new Thread2( "t1", 200 );
	        Runnable r2 = new Thread2( "t2", 300 );
	        
	        Thread t1 = new Thread ( r1 ) ;
	        Thread t2 = new Thread ( r2 ) ;
	        t1.start();
	        t2.start();
	    }
	}
	