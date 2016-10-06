import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by WataruS on 10/1/2016.
 */
public class FileProcess {
    private File file;

    public String getFileName(){
        return file.getName();
    }

    public String getFilePath(){
        return file.getAbsolutePath();
    }

    public FileProcess(String fileName) {
        file = createFile(fileName);
    }


    public File createFile(String filename) {

        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = workingDirectory + File.separator + filename;
        File file = new File(absoluteFilePath);
        if (!file.exists()) {
            try {
                if (file.createNewFile())
                    return file;
            } catch (IOException e) {
                System.out.println("Unable to create new file " + absoluteFilePath);
                e.printStackTrace();
            }
        }
        return file;
    }

    public void writeFile(String filePath, String content) {
        try {
            File file = new File(filePath);
            if (!file.exists())
                file.createNewFile();

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done writing content to " + filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    # This method will write input string (an array of list) to the input file
     */
    public void writeFile(String filePath, List<String> content) {
        try {
            File file = new File(filePath);
            if (!file.exists())
                file.createNewFile();

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for (String line : content) {
                bw.write(line);
                bw.newLine();
            }

            bw.close();
            System.out.println("Done writing content to " + filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    @ This method will read the content of input file and return an array of string, each line in the content of input file
    @ will be assigned to a member of the output array
    */
    public List<String> readFileLineByLine(String filePath) {
        File file = new File(filePath);
        BufferedReader br = null;
        List<String> result = new ArrayList<String>();
        if (file.exists()) {
            try {

                br = new BufferedReader(new FileReader(filePath));
                String currentLine;
                while ((currentLine = br.readLine()) != null) {
                    result.add(currentLine);
                }


                if (br.readLine() == null)
                    br.close();

                return result;

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            System.out.println("Input file isn't existed yet");
            return null;
        }

    }

    public void createDefaultSearchContent(File file){
        //Initial default data
        List<String> secureLogixMembers = new ArrayList<String>(Arrays.asList(
                "Hung Tran Manh - SecureLogix - Senior Engineer - 06/02/1990 - 0123456789 - Nha Trang",
                "Tu Pham Tran Vuong - SecureLogix - Senior Engineer - 01/01/1987 - 9874563210 - Tien Giang",
                "Chien Nguyen Huu - SecureLogix - Senior Engineer - 01/01/1989 - 8523697410 - Dak Lak",
                "Phu Nguyen Thai - SecureLogix - Consultant - 16/12/1988 - 1478520369 - Da Lat",
                "Danh Ho Cong- SecureLogix - Senior Engineer - 04/02/1990 - 8452107963 - Binh Thuan",
                "Tuyen Nguyen Thi Thanh - SecureLogix - Senior Engineer - 15/03/1988 - 9874102563 - Tuy Hoa",
                "Hoang Le Huy - SecureLogix - Consultant - 06/10/1984 - 8741025639 - Da Lat",
                "Tuyen Vu Xuan - SecureLogix - Engineer - 22/04/1991 - 0123456789 - Nha Trang",
                "Trung Doan Bao - SecureLogix - Consultant - 06/02/1989 - 9632587412 - Tien Giang"));


        //Write team data to file SecureLogix.txt

        createFile("SecureLogix.txt");
        writeFile(new File("SecureLogix.txt").getAbsolutePath(), secureLogixMembers);

        System.out.println("Default content is printed below: ");
        for (String line : readFileLineByLine(new File("SecureLogix.txt").getAbsolutePath()))
            System.out.println("\t" + line);
    }

    public List<Person> createPersonObjectFromFile(String filePath){
        List<String> secureLogixMembers = readFileLineByLine(filePath);
        
        List<Person> people = new ArrayList<Person>();        
        for(String line:secureLogixMembers){
            Person ob = new Person();
            ob.setPersonInfo(line.trim());
            people.add(ob);
        }
        return people;
    }

    public List<Person> searchByName(List<Person> people, String name){
        List<Person> result = new ArrayList<Person>();
        for(Person person:people){
            if (person.getName().contains(name.trim())){
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> searchByWorkingProject(List<Person> people, String workingProject){
        List<Person> result = new ArrayList<Person>();
        for(Person person:people){
            if (person.getWorkingProject().trim().equals(workingProject.trim())){
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> searchByPosition(List<Person> people, String position){
        List<Person> result = new ArrayList<Person>();
        for(Person person:people){
            if (person.getPosition().trim().equals(position.trim())){
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> searchByDateOfBirth(List<Person> people, String dateOfBirth){
        List<Person> result = new ArrayList<Person>();
        for(Person person:people){
            if (person.getDateOfBirth().trim().equals(dateOfBirth.trim())){
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> searchByPhoneNumber(List<Person> people, String phoneNumber){
        List<Person> result = new ArrayList<Person>();
        for(Person person:people){
            if (person.getPhoneNumber().trim().equals(phoneNumber.trim())){
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> searchByHometown(List<Person> people, String hometown){
        List<Person> result = new ArrayList<Person>();
        for(Person person:people){
            if (person.getHomeTown().trim().equals(hometown.trim())){
                result.add(person);
            }
        }
        return result;
    }

    public void searchByAttribute(String filePath, Scanner sc){
        List<Person> people = createPersonObjectFromFile(filePath);
        List<Person> searchResult = new ArrayList<Person>();

        createDefaultSearchContent(file);

        System.out.println("Select one of below numbers to search: ");
        System.out.println("1. Search By Name ");
        System.out.println("2. Search By Working Project ");
        System.out.println("3. Search By Position ");
        System.out.println("4. Search By Date Of Birth ");
        System.out.println("5. Search By Phone Number ");
        System.out.println("6. Search By Hometown ");

        String choice;
        do {
            System.out.print("Input your choice: ");
            //assign user input to input variable after validating
            choice = Utils.validateInputString(sc);

            if (! Utils.isNumber(choice)) {
                System.out.println("Your input is not valid one. Please input again.");
            } else
                break;
        } while (true);

        System.out.print("Input search text: ");
        String text = Utils.validateInputString(sc);
        switch (Integer.parseInt(choice)){
            case 1:
                searchResult = searchByName(people, text);
                break;
            case 2:
                searchResult = searchByWorkingProject(people, text);
                break;
            case 3:
                searchResult = searchByPosition(people, text);
                break;
            case 4:
                searchResult = searchByDateOfBirth(people, text);
                break;
            case 5:
                searchResult = searchByPhoneNumber(people, text);
                break;
            case 6:
                searchResult = searchByHometown(people, text);
                break;
            default:
                System.out.println("Your input number isn't in the support list.");
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("Found " + searchResult.size() + " record(s)");
        if (searchResult.size() > 0){
            System.out.println("Search result is showed below: ");
            for(Person p : searchResult){
                p.showPersonInfo();
            }

        }

    }

}
