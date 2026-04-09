package question.three;

import java.time.LocalDate;

public class DataService {
	private String getDayOfTheWeek() {
		return LocalDate.now().getDayOfWeek().toString();
	}
	public void getDay() {
		String day = getDayOfTheWeek();
		switch(day) {
		case "SUNDAY","SATURDAY" -> System.out.println("it's WEEKEND!");
		default -> System.out.println("it's WEEKDAY!");
		}
	}
}
