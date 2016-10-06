import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DataInit {

	public int[] arrayInit;
	public boolean found;
	
	
	//Print array elements
	public void printArray (int[] ar, int start){
		if ( start < ar.length){
			System.out.print("[" +ar[start]+ "] ");
			start = start + 1;
			printArray(ar, start);
		}
	
	}
	
	//Initiate array then assign for global variable
	public void addToArray(int[] ar, int agr){
		
		if (ar.length < agr){
			int[] temp = Arrays.copyOf(ar, ar.length + 1);		
			Random rd = new Random();
			temp[temp.length - 1] = rd.nextInt(10);
			addToArray(temp, agr);
		}
		else {
			printArray(ar, 0);
			arrayInit = ar;
		}
	}
	
	public void searchInArray(int[] ar, int input, int start){
			
		if (start < ar.length){
			if (ar[start] == input){
				System.out.println("value: " +ar[start]+ ", position: " + start);
				found = true; 
			}
			else{
				start = start + 1;
				searchInArray(ar, input, start);
			}
		}
		else {
			found = false;
		}
	}
	
	//search array
	public void searchArray(int[] ar, int input){
		
		Scanner scan = new Scanner(System.in);
		int search;
		searchInArray(ar, input, 0);
		
		if (!found){
			addToArray(ar, ar.length + 1);
			ar=arrayInit;
			System.out.println("\nPlease re-enter the information: ");
			search=scan.nextInt();
			searchArray(ar,search);
		}
		scan.close();
	}
}
