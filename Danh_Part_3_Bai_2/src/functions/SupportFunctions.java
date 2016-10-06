package functions;

import java.util.ArrayList;
import java.util.Random;

public class SupportFunctions {
	static ArrayList<Integer> arr_result = new ArrayList<Integer>();

	public static int generateRandomNumber(int min, int max) {
		Random rd = new Random();
		return rd.nextInt(max - min + 1) + min;
	}

	public static boolean isNumeric(String s) {
		return s.matches("\\d*\\.?\\d+");
	}

	public static ArrayList<Integer> returnArrayIndex(
			ArrayList<Integer> arr_list_C, int number) {
		addMatchIndexToArray(arr_list_C, number, 0);
		return arr_result;
	}

	static void addMatchIndexToArray(ArrayList<Integer> arr_list_D, int number,
			int index) {
		if (index < arr_list_D.size()) {
			if (arr_list_D.get(index) == number) {
				arr_result.add(index);
			}
			index++;
			addMatchIndexToArray(arr_list_D, number, index);
		}
	}
}
