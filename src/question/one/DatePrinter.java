package question.one;

import java.time.LocalDate;

public class DatePrinter {
	LocalDate currentDate;
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	
	public void printDate() {
		System.out.println("Today's Date is " + currentDate);
	}
}
