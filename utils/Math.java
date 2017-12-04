package utils;

public class Math {
	
	public static int factorial(int n) {
		if(n == 1) return 1;
		return n*factorial(n-1);
	}
	
	public static int factorialLoop(int n) {
		int res = 1;
		for(int i = 2; i <= n; i++) {
			res *= i;
		}
		return res;
	}

}
