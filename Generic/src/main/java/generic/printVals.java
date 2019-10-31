package generic;

public class printVals {
	
	public static <T> void printArr(T[] inputArray) {
		for (T element : inputArray) {
			System.out.print(element + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,3,2,1};
		Double[] floatArray = {1.2,2.2,3.1428};
		String[] stringArray = {"Hey","cool", "guy"};
		
		printArr(intArray);
		System.out.println();
		printArr(floatArray);
		System.out.println();
		printArr(stringArray);
		
	}

}
