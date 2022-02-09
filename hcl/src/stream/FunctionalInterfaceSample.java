package stream;

public class FunctionalInterfaceSample{
	
	@FunctionalInterface
	interface SumFuncInterface {
		int sum(int num1, int num2);
	}
	
	public static void main(String[] args) {
		SumFuncInterface sumFuncInterface = (num1, num2) -> num1 + num2;
		System.out.println(sumFuncInterface.sum(2,3));
	}
}
