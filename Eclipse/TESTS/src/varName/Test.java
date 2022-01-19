package varName;

public class Test {
	public static void main(String[] args) {
		System.out.println(forward(10));
		System.out.println(backward(5));
	}
	public static double forward(double limit) {
		double num=5,result=0;
		for(double i=0;i<limit;i++)
			result+=num;
		return result;
	}
	
	public static double backward(double limit) {
		double num=5;
		if(limit<=1)
			return num;
		else
			return backward(limit-1)+num;
	}
}
