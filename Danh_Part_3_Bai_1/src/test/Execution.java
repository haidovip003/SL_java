package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execution {

	public static Scanner reader = new Scanner(System.in);
	private static boolean repeatFlag = false;

	public static void main(String[] args) {
		
		// Create employee's instances
		Employee Chien = new Employee("Nguyen Huu Chien", "SecureLogix",
				"Senior Engineer", "0937625358", "Dak Lak");
		Chien.setBirthday("15/02/1989");
		Employee Phu = new Employee("Nguyen Thai Phu", "SecureLogix",
				"Consultant", "0973758298", "Dallas");
		Phu.setBirthday("28/12/1988");
		Employee Hung = new Employee("Tran Manh Hung", "SecureLogix",
				"Senior Engineer", "01667482912", "Khanh Hoa");
		Hung.setBirthday("07/03/1990");
		Employee Hoang = new Employee("Le Huy Hoang", "SecureLogix",
				"Consultant", "0979217534", "Dallas");
		Hoang.setBirthday("14/08/1984");
		
		//Initiate list of employee and add employee into list
		List<Employee> employee_list = new ArrayList<Employee>();
		employee_list.add(Chien);
		employee_list.add(Phu);
		employee_list.add(Hung);
		employee_list.add(Hoang);
		
		//User interaction cycle
		String search_text;
		do {
			System.out.println("Danh sach thong tin nhan vien:");
			printEmployeeList(employee_list);

			System.out.print("Nhap ki tu de tim nhan vien tuong ung:");
			search_text = reader.nextLine();

			List<Employee> people_result = new ArrayList<Employee>();
			for (Employee people : employee_list) {
				// check if search_text is contained in any attribute of employee
				// if true -> add employee into result employee list
				if (people.searchByAttributes(search_text)) {
					people_result.add(people);
				}
			}

			if (!people_result.isEmpty()) {
				System.out.println("..:: Tim thay ket qua ::..");
				printEmployeeList(people_result);
			} else {
				System.out.println("Khong tim thay nhan vien voi tu` khoa' ["
						+ search_text + "]");
			}

			System.out.println("=> Ban muon thu lai ko ?(y/n)");
			if (reader.nextLine().toLowerCase().equals("y")) {
				repeatFlag = true;
			}
		} while (repeatFlag == true);

		reader.close();
		System.out.println("Program ended.Thanks!");
	}

	static void printEmployeeList(List<Employee> employee_list) {
		for (Employee people : employee_list) {
			people.printEmployeeInfo();
		}
	}
}
