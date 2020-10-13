import static java.lang.System.*;

public class Artilleria {

    private static int aAtaque;
    private static int aDefensa;

    public static void Artilleria (){

        Personaje PersonajeObj = new Personaje(0,0,aAtaque,aDefensa,0);
        PersonajeObj.getVida();

    }
}
