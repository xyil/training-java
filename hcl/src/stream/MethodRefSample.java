package stream;

interface Sayable{
	void say();
}

public class MethodRefSample {

	public static void saySomething() {
		System.out.println("Method Reference Sample");
	}
	
	public static void main(String[] args) {
		Sayable sayable = MethodRefSample::saySomething;
		sayable.say();
	}

}
