class A {
	
public void show()
 {
		System.out.println("in A");
	}

class B extends A 
{
		@Override
		public void show() {
			// Arraylist obj = new Arraylist<>();

			System.out.println("in B");
		}
	}
}

public class Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.show();
	}

}
