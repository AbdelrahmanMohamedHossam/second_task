package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import POM.BaseClass;
import POM.Homepage;
import POM.Search_result;

public class Scenario1 extends BaseClass {

	@Test(priority = 1)
	public void select_popular_rout() throws InterruptedException {
		Homepage.get_popular_routs("Chikkamagaluru - Bengaluru");
		Homepage.select_departue_date();
		Homepage.Click_on_search_btn();
	}

	@Test(priority = 2)
	public void select_seats() {

		Search_result.find_available_seats();
		Search_result.select_available_seat();
	}

	@Test(priority = 3)
	public void complete_data() {

		Search_result.complete_passenger_details("abdelrahman", "MALE", "25");
		Search_result.dropping_point();
		Search_result.customer_details("6789125987", "abdelrahman@test.com");
		BaseClass.get_driver().findElement(By.id("PgBtn")).click();

	}
}
