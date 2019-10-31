package generic;

import java.lang.reflect.Array;

public class NumericArrayUtils {
	
	//NOTE: The <T> defines the type for that method, and is independent of all other methods and the class's <T>,
	// nor is it a return value (hence the second T)

	public static <T> T getMin(T[] array) {
		T min = array[0];

        return min;
	}
	
    public static <T> T getMax(T[] array) {
		T max = array[0];

        return max;
    }
	
	public static <T> T[] getMinMax(T[] array) {
		T[] arrayPair = (T[])new Object[2];
		arrayPair[0] = getMin(array);
		arrayPair[1] = getMax(array);
		return arrayPair;
	}

	public static <T> T getSum(T[] array) {
		T sum = array[0];
        return sum;
	}
	public static <T> T getAvg(T[] array) {
        return NumericArrayUtils.getSum(array);///array.length;
	}

	public static <T> T[] getSumAvg(T[] array) {
		T[] arrayPair = (T[])new Object[2];
		arrayPair[0] = getSum(array);
		arrayPair[1] = getAvg(array);
		return arrayPair;
	}

	private <T> Boolean validateArray(T[] array) {
		Boolean bValid = true;
		// ensure it has an element
		// Maybe ensure it is numeric
		return bValid;
	}

	// public static void main(String[] args) {
		
	// 	String c = "cool";
	// 	int t = 45;
		
	// 	Pair test = new Pair(t,c);
		
	// 	System.out.println(test.toString());
	// }

}
