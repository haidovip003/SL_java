import java.util.Scanner;

/**
 * Created by WataruS on 10/1/2016.
 */
public class PersonTest {
    public static void main(String args[]){
        FileProcess fp = new FileProcess("SecureLogix.txt");
        Scanner sc = new Scanner(System.in);
        String isContinue = "";
        do {
            fp.searchByAttribute(fp.getFilePath(), sc);

            System.out.println("----------------------------------------------------------------");
            System.out.println("Do you want to continue? Press N to stop, other to continue...");
            System.out.print("Please give your answer: ");
            //assign user input to input variable after validating
            isContinue = Utils.validateInputString(sc);

        } while (!(isContinue.toLowerCase().equals("n")));

        sc.close();
        System.out.println("Bye!!!");


    }
}
