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

    public static List devolverValor() throws IOException, InterruptedException {
    //F: Solicita la llamada de la API a JSONPlaceHolder.
    //E: URL y headers de las paginas.
    //S: Una lista con objetos tipo Post.

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create("http://jsonplaceholder.typicode.com/comments"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //Parse
        ObjectMapper mapper = new ObjectMapper();
        List<Post> posts = mapper.readValue(response.body(), new TypeReference<List<Post>>() {
        });

    return posts;
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        }

    }


