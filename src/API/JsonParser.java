package API;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;

public class JsonParser {
	
	public JsonParser(){
	String jsonString = "[{\"id\":\"98235f33b2e4e22ef073588d0c3af6d8\",\"sport_key\":\"americanfootball_nfl\",\"sport_title\":\"NFL\",\"commence_time\":\"2023-02-12T23:35:00Z\",\"home_team\":\"Philadelphia Eagles\",\"away_team\":\"Kansas City Chiefs\",\"bookmakers\":[{\"key\":\"betonlineag\",\"title\":\"BetOnline.ag\",\"last_update\":\"2023-01-31T02:49:26Z\",\"markets\":[{\"key\":\"h2h\",\"last_update\":\"2023-01-31T02:49:26Z\",\"outcomes\":[{\"name\":\"Kansas City Chiefs\",\"price\":110},{\"name\":\"Philadelphia Eagles\",\"price\":-132}]},{\"key\":\"spreads\",\"last_update\":\"2023-01-31T02:49:26Z\",\"outcomes\":[{\"name\":\"Kansas City Chiefs\",\"price\":-111,\"point\":2.0},{\"name\":\"Philadelphia Eagles\",\"price\":-111,\"point\":-2.0}]}]}]}]";
	//JSONStringer jsonString = new JSONStringer();	
	JSONArray jsonArray = new JSONArray(jsonString);
    JSONObject jsonObject = jsonArray.getJSONObject(0);

    String id = jsonObject.getString("id");
    String sportKey = jsonObject.getString("sport_key");
    String commenceTime = jsonObject.getString("commence_time");
    String homeTeam = jsonObject.getString("home_team");
    String awayTeam = jsonObject.getString("away_team");

    JSONArray bookmakersArray = jsonObject.getJSONArray("bookmakers");
    JSONObject bookmakersObject = bookmakersArray.getJSONObject(0);
    JSONArray marketsArray = bookmakersObject.getJSONArray("markets");
    JSONObject marketsObject = marketsArray.getJSONObject(0);
    JSONArray outcomesArray = marketsObject.getJSONArray("outcomes");
    JSONObject outcomesObject = outcomesArray.getJSONObject(0);

    int price = outcomesObject.getInt("price");
    
    System.out.println(outcomesArray.toString());
    System.out.println("ID: " + id);
    System.out.println("Sport Key: " + sportKey);
    System.out.println("Commence Time: " + commenceTime);
    System.out.println("Home Team: " + homeTeam);
    System.out.println("Away Team: " + awayTeam);
    System.out.println("Price: " + price);
}
}

