package assignment9;

public class Assignment9 {

	public static void main(String[] args) {

		String strArr[] = new String[5];

		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Mango";
		strArr[3] = "Watermelon";
		strArr[4] = "Berry";

		// Printing the array elements
		printArrayElements(reverseStringArr(strArr, strArr.length));
	}

	public static void printArrayElements(String[] strArr) {
		// Printing the array elements
		for (String elem : strArr) {
			System.out.println(elem);
		}
	}

	public static String[] reverseStringArr(String[] strArr, int len) {
		String[] reversedArr = new String[len];
		for (int i = strArr.length - 1, j = 0; i > -1; i--, j++) {
			reversedArr[j] = strArr[i];
		}
		return reversedArr;
	}
}
