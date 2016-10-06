/**
 * 
 */
package com.hkr.chap4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author eraoni
 *
 */
public class LoopWithoutLoop {
    
    private ArrayList<Integer> listNumber = new ArrayList<>();
    
    public int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(50) + 1;
    }
    
    public void inputNumber(Scanner sc) {
        System.out.println("Press a number: ");
        int n = sc.nextInt();
        sc.nextLine();
        checkArray(n, sc);
    }
    
    public void checkArray(int n, Scanner sc) {
        if (this.listNumber.contains(n)) {
            System.out.println("Number: " + n + ", " + "Index: " + this.listNumber.indexOf(n));
        } else {
            this.listNumber.add(randomNumber());
            inputNumber(sc);
        }
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        LoopWithoutLoop lwl = new LoopWithoutLoop();
        Scanner sc = new Scanner(System.in);
        lwl.inputNumber(sc);
        sc.close();
    }

}
