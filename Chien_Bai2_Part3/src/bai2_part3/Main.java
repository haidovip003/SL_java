package bai2_part3;

import java.util.Random;
import java.util.Scanner;

public class Main {
	static int arrSize = 5;
	static int[] arrInt;
	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);
	static int input;
	static int foundIndex = -1;
	static int foundValue = -1;
	
	static String getInputString() {
		String input = "";
		
		input = scanner.next();
		
		return input;
	}
	
	static int getInputNumber() {
		int output = -1;
		
		try {
			output = Integer.parseInt(getInputString());
		} catch (Exception e) {	}
		
		return output;
	}
	
	static void createArray(int arrSize) {
		if ( arrSize > 0 ) {
			Main.arrInt[arrSize-1] = random.nextInt(9);
			System.out.println("arr[" + (arrSize-1) + "] = " + Main.arrInt[arrSize-1]);
			createArray(arrSize-1);
		}
	}
	
	static boolean find(int arrSize) {
		if ( arrSize == 0)
			return false;
		
		if ( Main.arrInt[arrSize-1] == Main.input ){
			Main.foundIndex = arrSize-1;
			Main.foundValue = Main.arrInt[arrSize-1];
			return true;
		}	
		
		return find(arrSize-1);
	}
	
	static void run() {
		Main.arrInt  = new int[Main.arrSize];

		System.out.println("Array with size " + Main.arrSize);
		createArray(Main.arrSize);
			
		System.out.println("Input number to search : ");
		Main.input = getInputNumber();
		
		if ( !Main.find(arrSize) ) {
			Main.arrSize++;
			System.out.println("Can't see " + Main.input + " in array");
			System.out.println("----------------------------");
			run();
		}
	}
	
	public static void main(String[] args) {		
		run();
		System.out.println("Found : arr[" + Main.foundIndex + "] = " + Main.foundValue );
	}

}
