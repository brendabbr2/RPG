import static java.lang.System.*;

public class Pociones {

    private static int pVida;
    private static int pMagia;
    private static int pEnergia;

    public static void Pociones (){

        Personaje PersonajeObj = new Personaje(pVida, pMagia, 0,0, pEnergia);
        PersonajeObj.getVida();
        PersonajeObj.getMagia();
        PersonajeObj.getEnergia();
    }
}
