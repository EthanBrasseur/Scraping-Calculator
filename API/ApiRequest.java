package API;

public class ApiRequest {
	
	String sportsBook;
	String apiKey;
	
	public ApiRequest(String sportsBook, String apiKey) {
		this.sportsBook = sportsBook;
		this.apiKey = apiKey;
	}
	
	public int getOdds(String sport){
		HTTPClient connection = new HTTPClient();
		
		//String URL = "https://api.the-odds-api.com/v4/sports/" + sport + "/odds/?apiKey=" + apiKey + "&regions=us";
		String URL = "https://api.the-odds-api.com/v4/sports/americanfootball_nfl/odds/?apiKey=6e132c8365e1f407ce06107cb47ddfea&regions=us&markets=h2h,spreads&oddsFormat=american";
		
		try {
			connection.get(URL);
		}catch (Exception ex) {
			System.out.println("Uh oh!" + ex);
		}
		
		return 0;
	}
	
	

}
