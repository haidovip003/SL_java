/**
 * 
 */
package securelogix.java.course.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import securelogix.java.course.common.Global;

/**
 * @author macbookpro
 *
 */
public class TMAEmployee {
	public void Init(String employee_string) throws Exception {
		try {
			List<String> emp_elements = Arrays.asList(employee_string.split("-"));
			if (emp_elements.size() == 6) {
				this.setName(emp_elements.get(0));
				this.setTeam(emp_elements.get(1));
				this.setTitle(emp_elements.get(2));
				this.setBirthday(emp_elements.get(3));
				this.setPhone(emp_elements.get(4));
				this.setHometown(emp_elements.get(5));
			}
		} catch (Exception e) {
			throw e;
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (Global.isInEnum(title)) {
			this.title = title;
		} else {
			this.title = Global.Title.NOT_DEFINE.name();
		}
	}

	public String getBirthday() {
		return birthday.toString();
	}

	public void setBirthday(String birthday) throws ParseException {
		this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
	}

	public String getPhone() {
		return "0" + phone.toString();
	}

	public void setPhone(String phone) throws NumberFormatException {
		this.phone = Integer.parseInt(phone);
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	@Override
	public String toString() {
		return name + " - " + team + " - " + title + " - " + birthday + " - " + phone + " - " + hometown;
	}

	private String name;
	private String team;
	private String title;
	private Date birthday;
	private Number phone;
	private String hometown;
}
