package glue.orders.jbehave;

import glue.orders.utils.WebDriverConfigurer;
import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {
	
	public AcceptanceTestSuite() {
		
		WebDriverConfigurer.configureDrivers();
		
		}
	
}
