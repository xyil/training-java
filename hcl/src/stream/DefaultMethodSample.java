package stream;

public class DefaultMethodSample {
	
	interface SquareInt{
		public void square(int a);
		
		default void show() {
			System.out.println("Default Method Sample");
		}
	}
	
	public void square(int a) {
		System.out.println(a*a);
	}
	
	public static void main(String args[]) {
		DefaultMethodSample d = new DefaultMethodSample();
		d.square(4);
	}
}
