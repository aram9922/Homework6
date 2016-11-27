package utils;

public class Math{
	public static int factorial(int a){
		if (a<=1)
			return 1;
		return a*factorial(--a);
	}
	public static int factorialLoop(int a){
		int result = 1;
		while (a>1){
			result*=a;
			a-=1;
		}
		return result;
	}
}