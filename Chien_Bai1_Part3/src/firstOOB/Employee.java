package firstOOB;

public class Employee {
	private String name;
	private String project;
	private String position;
	private String birthday;
	private String phoneNumber;
	private String home;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public void say() {
		System.out.println("Name : " + name);
		System.out.println("Project : " + project);
		System.out.println("Position : " + position);
		System.out.println("Birthday : " + birthday);
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("Home : " + home);
	}

}
