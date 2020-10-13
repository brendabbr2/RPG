
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class intentoAPI{

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create("http://jsonplaceholder.typicode.com/comments"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //Parse
        ObjectMapper mapper= new ObjectMapper();
        List <Post> posts= mapper.readValue(response.body(), new TypeReference<List<Post>>(){});
        //Post articulo = new Post;
        for(int cont=0; cont<20; cont++) {
            Post elemento= posts.get(cont);
            System.out.println(elemento.getEmail());
            System.out.println(cont);
        }//Array elementosGlobal = new Array;
        //posts.forEach(elementosGlobal.add());


    }
}
