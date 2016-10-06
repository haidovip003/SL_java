package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import firstOOB.Employee;

public class FindEmployee {
	
	public String getInputString(Scanner scanner) {
		String input = "";
		
		input = scanner.next();
		
		return input;
	}
	
	public int getInputNumber(Scanner scanner) {
		int output = -1;
		
		try {
			output = Integer.parseInt(getInputString(scanner));
		} catch (Exception e) {	}
				
		if ( output < 0 || output > 6)
			return -1;
		
		return output;
	}
	
	public ArrayList<Employee> listToArray (List<String> list) {
		ArrayList<Employee> arrEmp = new ArrayList<Employee>();
		
		for (String str : list) {
			String[] strArr = str.split(" - ");
			Employee emp = new Employee();
			
			emp.setName(strArr[0]);
			emp.setProject(strArr[1]);
			emp.setPosition(strArr[2]);
			emp.setBirthday(strArr[3]);
			emp.setPhoneNumber(strArr[4]);
			emp.setHome(strArr[5]);
			
			arrEmp.add(emp);
		}
		
		return arrEmp;
	}
	
	public ArrayList<Employee> findEmployee (ArrayList<Employee> arrEmp, int index, String value) {
		ArrayList<Employee> arrEmpTemp = new ArrayList<Employee>();
		
		switch (index) {
			case 1:
				for (Employee emp : arrEmp ) {
					if (emp.getName().toLowerCase().contains(value.toLowerCase())) {
						arrEmpTemp.add(emp);
					}
				}
				
				break;
			case 2:
				for (Employee emp : arrEmp ) {
					if (emp.getProject().toLowerCase().contains(value.toLowerCase())) {
						arrEmpTemp.add(emp);
					}
				}
				
				break;
				
			case 3:
				for (Employee emp : arrEmp ) {
					if (emp.getPosition().toLowerCase().contains(value.toLowerCase())) {
						arrEmpTemp.add(emp);
					}
				}
				
				break;
				
			case 4:
				for (Employee emp : arrEmp ) {
					if (emp.getBirthday().toLowerCase().contains(value.toLowerCase())) {
						arrEmpTemp.add(emp);
					}
				}
				
				break;
				
			case 5:
				for (Employee emp : arrEmp ) {
					if (emp.getPhoneNumber().toLowerCase().contains(value.toLowerCase())) {
						arrEmpTemp.add(emp);
					}
				}
				
				break;
				
			case 6:
				for (Employee emp : arrEmp ) {
					if (emp.getHome().toLowerCase().contains(value.toLowerCase())) {
						arrEmpTemp.add(emp);
					}
				}
				
				break;

			default:
				break;
		}
		
		return arrEmpTemp;
	}
}
