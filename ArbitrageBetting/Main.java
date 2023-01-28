package ArbitrageBetting;

import Scraper.*;
import API.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Calculator test = new Calculator("Betonline", "Bovada", "N/A", "N/A", 100);

		// Scraper test1 = new Scraper();
		// test1.scrape("https://www.betonline.ag/sportsbook");

		// System.out.println(test.calculate(2, 2.2, 100));

		ApiRequest test = new ApiRequest("betonlineag", "6e132c8365e1f407ce06107cb47ddfea");
		
		test.getOdds("basketball_nba");

		//System.out.println("Testing 2 - Send Http POST request"); test.sendPost();
		 

	}
}
