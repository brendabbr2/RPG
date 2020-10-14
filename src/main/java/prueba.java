import java.io.IOException;
import java.util.List;

public class prueba {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(intentoAPI.devolverValor().get(1));
        List<Post> posts= intentoAPI.devolverValor();
        System.out.println(posts.get(1).getCategoria());

        Personaje ear = new Personaje();
        System.out.println(ear.getDinero());
    }
}
