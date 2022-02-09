package stream;

interface Greeting{
	static void hello() {
		System.out.println("Hello, Static Method");
	}
}

public class StaticInterfaceSample implements Greeting{
	public static void main(String[] args) {
		Greeting.hello();
	}
}
