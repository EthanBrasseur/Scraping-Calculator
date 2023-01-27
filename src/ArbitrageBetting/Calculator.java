package ArbitrageBetting;
import java.lang.Math;

public class Calculator {
	
	//Global variables
	String website1;
	String website2;
	String url1;
	String url2;
	
	/*
	 * Constructor class, initializes variables to inputed values
	 * 
	 * @param website1: Website where odds1 is located
	 * @param website2: Website where odds2 is located
	 * @param url1: url of website1 bet
	 * @param url2: url of website2 bet
	 * @param desiredReturn: the desired percent return from a bet. Used to calculate if a bet is viable
	 */
	
	public Calculator(String website1, String website2, String url1, String url2, double desiredReturn) { 
		
		this.website1 = website1;
		this.website2 = website2;
		this.url1 = url1;
		this.url2 = url2;
		
	}
	
	
	/*
	 * Method that returns the percent return of a bet given odds
	 * @param odds1: odds for outcome 1
	 * @param odds2: odds for outcome 2
	 * 
	 * @return rounded: The total profit returned from the bet rounded to 2 decimals
	 */
	
	public double calculate(double odds1, double odds2, double betAmount) {
		double arbitragePercent;
		double rounded;
		
		arbitragePercent = ((1/odds1)*100) + ((1/odds2)*100);
		double profitPercent = 100-arbitragePercent;
		rounded = (double) Math.round(profitPercent * 100) / 100; //round to 2 decimals
		
		return rounded;
	}
	
	
	/*
	 * Method that converts american odds to decimal
	 * @param americanOddsInt: american odds to convert
	 * 
	 * @return decimal: double value of the american odds converted to decimal
	 */
	
	public double convertToDecimal(int americanOddsInt) {
		double decimal;
		double americanOdds = (double)americanOddsInt;
		
		//Calculation changes if american odds are positive or negative
		if(americanOdds > 0) {
			decimal = 1 + (americanOdds/100);
		}else {
			decimal = 1 + (100 / Math.abs(americanOdds));
		}
		
		return decimal;
	}
}
