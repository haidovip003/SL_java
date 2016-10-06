import java.util.Scanner;

/**
 * Created by WataruS on 10/1/2016.
 */
public class Person {
    private String  name;
    private String  workingProject;
    private String  position;
    private String  dateOfBirth; //"MM/dd/yyyy"
    private String  phoneNumber; //phone number's length is 10 or 11
    private String  homeTown;



    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getWorkingProject() {
        return workingProject;
    }

    private void setWorkingProject(String workingProject) {
        this.workingProject = workingProject;
    }

    public String getPosition() {
        return position;
    }

    private void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeTown() {
        return homeTown;
    }

    private void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setPersonInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        setName(Utils.validateInputString(sc));

        System.out.print("Working Project: ");
        setWorkingProject(Utils.validateInputString(sc));

        System.out.print("Current position: ");
        setPosition(Utils.validateInputString(sc));

        System.out.print("Date Of Birth in dd/MM/yyyy format: ");
        setDateOfBirth(Utils.validateInputString(sc));

        System.out.print("Phone Number: ");
        setPhoneNumber(Utils.validateInputPhoneNumber(sc));

        System.out.print("Hometown: ");
        setHomeTown(Utils.validateInputString(sc));

        sc.close();
    }

    public void setPersonInfo(String name, String workingProject, String dateOfBirth,
                              String phoneNumber, String homeTown){
        setName(name);
        setWorkingProject(workingProject);
        setDateOfBirth(dateOfBirth);
        setPhoneNumber(phoneNumber);
        setHomeTown(homeTown);
    }

    public void setPersonInfo(String personInfo){
        String[] output = personInfo.split("-");
        setName(output[0]);
        setWorkingProject(output[1]);
        setPosition(output[2]);
        setDateOfBirth(output[3]);
        setPhoneNumber(output[4]);
        setHomeTown(output[5]);
    }

    public void showPersonInfo(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Working Project: " + getWorkingProject());
        System.out.println("Current Position: " + getPosition());
        System.out.println("Date Of Birth: " + getDateOfBirth());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Hometown: " + getHomeTown());
    }


}
