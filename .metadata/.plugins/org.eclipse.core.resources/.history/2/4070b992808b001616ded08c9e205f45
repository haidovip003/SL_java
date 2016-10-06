package test;

import functions.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Execution {

	static Scanner reader = new Scanner(System.in);
	static String tmp_num;
	static boolean flag = false;
	static int num;

	public static void main(String[] args) {

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(SupportFunctions.generateRandomNumber(1, 10));
		arrlist.add(SupportFunctions.generateRandomNumber(1, 10));
		arrlist.add(SupportFunctions.generateRandomNumber(1, 10));
		arrlist.add(SupportFunctions.generateRandomNumber(1, 10));
		arrlist.add(SupportFunctions.generateRandomNumber(1, 10));

		runProgram(arrlist);

		reader.close();
		System.out.println("Program ended. Thank you!");
	}

	static void printArray(ArrayList<Integer> arr, int index) {
		if (index < arr.size()) {
			System.out.print("[" + arr.get(index) + "] ");
			index++;
			printArray(arr, index);
		}
	}

	static void lookForMatchNumber(ArrayList<Integer> arr_list_B, int number,
			int index) {
		if (index < arr_list_B.size()) {
			if (arr_list_B.get(index) == number) {
				System.out.println("Tim thay phan tu " + number
						+ " tai vi tri "
						+ SupportFunctions.returnArrayIndex(arr_list_B, number));
				flag = true;
			}
			if ( flag == false){
				index++;
				lookForMatchNumber(arr_list_B, number, index);
			}
		}
	}

	static void runProgram(ArrayList<Integer> arr_list_A) {
		printArray(arr_list_A, 0);
		System.out.print("\nNhap so can tim: ");
		tmp_num = reader.nextLine();
		if (SupportFunctions.isNumeric(tmp_num)) {
			num = Integer.parseInt(tmp_num);
			lookForMatchNumber(arr_list_A, num, 0);
		}
		if (flag == false) {
			arr_list_A.add(SupportFunctions.generateRandomNumber(1, 10));
			runProgram(arr_list_A);
		}
	}
}
