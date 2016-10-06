package securelogix.java.course.common;

import java.util.Arrays;

public class Global {
	public enum Title {
		NOT_DEFINE, ENGINEER, SENIOR_ENGINEER, CONSULTANT, SENIOR_CONSULTANT, PRINCIPAL
	}

	public static boolean isInEnum(String value) {
		return Arrays.stream(Title.values()).anyMatch(e -> e.name().equals(value));
	}
}