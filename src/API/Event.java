package API;

public class Event {
		String id;
		String sports_key;
		String commence_time;
		String home_team;
		String away_team;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getSports_key() {
			return sports_key;
		}
		public void setSports_key(String sports_key) {
			this.sports_key = sports_key;
		}
		public String getCommence_time() {
			return commence_time;
		}
		public void setCommence_time(String commence_time) {
			this.commence_time = commence_time;
		}
		public String getHome_team() {
			return home_team;
		}
		public void setHome_team(String home_team) {
			this.home_team = home_team;
		}
		public String getAway_team() {
			return away_team;
		}
		public void setAway_team(String away_team) {
			this.away_team = away_team;
		}
		
	}