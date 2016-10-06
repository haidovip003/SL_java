package t;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
 
/**
 * Created by tranmanhhung on 10/3/2016.
 */
public class Hung_Part_3_Bai_2 {
 
    private static int a = 0;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
 
        List<Integer> array = new ArrayList<Integer>();
        array = add5NumberToArray();
 
 
        System.out.print("Nhap  1 so: ");
        int num = sc.nextInt();
 
        int i = 0;
        findNumber(array, i, num);
 
    }
 
    public static void findNumber(List<Integer> list, int i, int searchNumber) {
        System.out.println("Check number " + searchNumber + " again array[" + i + "] = " + list.get(i));
        if (list.get(i) == searchNumber) {
            System.out.println("Search number " + searchNumber + " is found at index " + i);
//            System.exit(0);
        } else {
            list.add(randomInteger(1, 1000));
            i++;
            findNumber(list, i, searchNumber);
        }
 
 
//        System.out.println("This is a function call main function");
//        main(new String[]{"Quan"});
    }
 
 
    public static int randomInteger(int min, int max) {
 
        Random rand = new Random();
 
        // nextInt excludes the top value so we have to add 1 to include the top value
        int randomNum = rand.nextInt((max - min) + 1) + min;
 
        return randomNum;
    }
 
    public static List<Integer> add5NumberToArray() {
        List<Integer> array = new ArrayList<Integer>();
        array.add(randomInteger(1, 10));
        array.add(randomInteger(1, 10));
        array.add(randomInteger(1, 10));
        array.add(randomInteger(1, 10));
        array.add(randomInteger(1, 10));
        return array;
    }
 
 
}