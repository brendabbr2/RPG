public class Personaje {
    //Atributos
    private int vida= 2;
    private int magia= 6;
    private int ataque= 7;
    private int defensa= 8;
    private int energia= 9;

    //Sets
    public Personaje (int vida, int magia, int ataque, int defensa, int energia){
        //Antes de que me tiren un zapato: Ey esto solo así sirve
        //Yo quería tener todos los sets separados pero lanza error :c
        this.vida = getVida() + vida;
        this.magia = getMagia() + magia;
        this.ataque = getAtaque() + ataque;
        this.defensa = getDefensa() + defensa;
        this.energia = getEnergia() + energia;
    }

    //Gets
    public int getVida() {
        return vida;
    }
    public int getMagia() {
        return magia;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getEnergia() {
        return energia;
    }
}
