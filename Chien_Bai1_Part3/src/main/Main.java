package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import firstOOB.Employee;
import util.FileProcess;
import util.FindEmployee;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Define
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		FileProcess fileProcess = new FileProcess();
		FindEmployee findEmp = new FindEmployee();
		
		List<String> list = fileProcess.listInit();
		
		fileProcess.write(System.getProperty("user.dir") + "\\sl.txt", list, false);
		
		list = fileProcess.read(System.getProperty("user.dir") + "\\sl.txt");
		
		listEmp = findEmp.listToArray(list);
	
		while(true){
			System.out.println("-------------------------\n");
			System.out.println("Select one of properties to search (0-6) : ");
			System.out.println("	1 - Name");
			System.out.println("	2 - Project");
			System.out.println("	3 - Position");
			System.out.println("	4 - Birthday");
			System.out.println("	5 - Phone number");
			System.out.println("	6 - Address");
			System.out.println("	0 - quit");
			
			//Get input property
			int index = findEmp.getInputNumber(scanner);
			
			if ( index == -1 ) {
				System.out.println("Wrong input");
				continue;
			}
			else if ( index == 0) 
				break;
				
			//Get input value to search
			System.out.println("Input value to search : ");
			String input = findEmp.getInputString(scanner);
			
			//Search
			ArrayList<Employee> foundEmps = findEmp.findEmployee(listEmp, index, input);
			
			System.out.println("Found " + foundEmps.size() + " employee(s) with \"" + input + "\" for propety \"" + index + "\" : ");
			for ( Employee emp : foundEmps ) {
				System.out.println("-----------------------------------");
				emp.say();
			}
			
		}
	}
}
