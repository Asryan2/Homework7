package utils;

public class ArrayUtils {

	public static int[] reverse(int[] arr) {
		for(int i = 0; i < arr.length / 2; i++)
		{
		    int temp = arr[i];
		    arr[i] = arr[arr.length - i - 1];
		    arr[arr.length - i - 1] = temp;
		}
		return arr;
	}
	
	public static String stringifyArray(int[] arr) {
		String res = "";
		for(int i = 0; i < arr.length; i++) {
			res += arr[i];
			if(i+1<arr.length)
				res+=",";
		}
		return res;
	}
}
