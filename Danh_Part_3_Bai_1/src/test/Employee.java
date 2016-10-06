package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	private String name;
	private String project;
	private String position;
	private Date birthday;
	private String mobilenumber;
	private String province;

	public String getBirthday() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String birthdayString = null;
		try {
			birthdayString = df.format(birthday);
		} catch (Exception e) {
		}
		return birthdayString;
	}

	public void setBirthday(String birthdayString) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date birthday = null;
		try {
			birthday = df.parse(birthdayString);
		} catch (Exception e) {
		}
		this.birthday = birthday;
	}

	public Employee(String name, String project, String position,
			String mobilenumber, String province) {
		super();
		this.name = name;
		this.project = project;
		this.position = position;
		this.mobilenumber = mobilenumber;
		this.province = province;
	}

	public void printEmployeeInfo() {
		System.out.println(name + " - " + project + " - " + position + " - "
				+ getBirthday() + " - " + mobilenumber + " - " + province);
	}

	public boolean searchByAttributes(String search_text) {
		if (name.toLowerCase().contains(search_text.toLowerCase())
				|| project.toLowerCase().contains(search_text.toLowerCase())
				|| position.toLowerCase().contains(search_text.toLowerCase())
				|| getBirthday().toLowerCase().contains(search_text.toLowerCase())
				|| mobilenumber.toLowerCase().contains(search_text.toLowerCase())
				|| province.toLowerCase().contains(search_text.toLowerCase())) {
			return true;
		}
		return false;
	}
}
