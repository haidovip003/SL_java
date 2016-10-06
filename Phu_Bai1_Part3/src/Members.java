
public class Members {
	private String name;
	private String project;
	private String position;
	private String dateofbirth;
	private String phone;
	private String country;
	
	public void setName(String newName) {
		name=newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setProject(String newProject) {
		project=newProject;
	}
	
	public String getProject() {
		return project;
	}
	
	public void setPosition(String newPosition) {
		position=newPosition;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setDateOfBirth(String newDateOfBirth) {
		dateofbirth=newDateOfBirth;
	}
	
	public String getDateOfBirth() {
		return dateofbirth;
	}
	
	public void setPhone(String newPhone) {
		phone=newPhone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void getCountry(String newCountry) {
		country=newCountry;
	}
		
	public String getCountry() {
		return country;
	}
	
	public void setAll(String newName, String newProject, String newPosition, String newDateOfBirth, String newPhone, String newCountry) {
		name=newName;
		project=newProject;
		position=newPosition;
		dateofbirth=newDateOfBirth;
		phone=newPhone;
		country=newCountry;
	}
	
	public String getAll() {
		return "Name: " + name + "\nProject: " + project + "\nPosition: " + position + "\nDateofBirth: " + dateofbirth + "\nPhone: " + phone + "\nCountry: " + country;
	}
}
