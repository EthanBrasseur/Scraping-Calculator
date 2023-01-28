package API;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class HTTPClient {
	
    private final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    
    public void get(String URL) throws Exception {

        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(URL)).setHeader("User-Agent", "Java 11 HttpClient Bot").build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        //Status
        System.out.println("Status code: " + response.statusCode());

        //Response
        System.out.println(response.body());

    }

}
