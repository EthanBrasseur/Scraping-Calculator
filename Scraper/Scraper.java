package Scraper;

import javax.net.ssl.HttpsURLConnection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

public class Scraper {

	public String scrape(String inputURL) {

		try {
			URL url = new URL(inputURL);
			HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
			con.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");

			System.out.println("****** Content of the URL ********");
			final BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String input;
			
			try{
				    BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
				    
					while ((input = br.readLine()) != null) {
						writer.write(input);
					}
				    
					br.close();
				    writer.close();
				    
			}catch(Error e) {
				System.out.println(e);
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "asfa";
	}
}
