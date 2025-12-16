import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientDemo {

    public static void Demo(){

        try{

       HttpClient client = HttpClient.newBuilder()
               .version(HttpClient.Version.HTTP_1_1)
               .connectTimeout(Duration.ofSeconds(5))
               .build();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.gameofthronesquotes.xyz/v1/random"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send
                    (request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());


        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
