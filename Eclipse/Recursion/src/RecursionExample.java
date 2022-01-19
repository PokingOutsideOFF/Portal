
public class RecursionExample {

	public static void main(String[] args) {
		recurseMethod(4);
		System.out.println(factorial(5));
		System.out.println(fib(9));
	}
	static void recurseMethod(int num) {
		if(num==0)
			return;
		else {
			System.out.println("hello" + num);
			recurseMethod(--num);
			System.out.println("" + num);
			return;
		}
	}
	
	public static double factorial(double num) {
		if(num<=1)
			return 1;
		else
			return num*factorial(num-1);
	}
	
	public static double fib(double d) {
		if(d<2)
			return d;
		else
			return fib(d-1)+fib(d-2);
	}
}
