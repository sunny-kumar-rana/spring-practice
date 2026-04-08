package question.two;

import java.time.LocalDate;

public class DiscountCalculator {
	private LocalDate currentDate = LocalDate.now();
	private double price;
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void calculateDiscount() {
		String day = currentDate.getDayOfWeek().toString();
		
		switch(day) {
			case "SATURDAY", "SUNDAY" -> System.out.println("Discounted Price: " + (price - (price * 0.2)) + " (20% discount applied)");
			default -> System.out.println("Discounted Price: " + (price - (price * 0.1)) + " (10% discount applied)");
		}
		
	}
}
