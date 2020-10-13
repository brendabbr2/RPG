public class Personaje {
    //Atributos
    private int vida= 2;
    private int magia= 6;
    private int ataque= 7;
    private int defensa= 8;
    private int energia= 9;
    private static int dinero=3000;


    //Sets
    public Personaje (){
        //Antes de que me tiren un zapato: Ey esto solo así sirve
        //Yo quería tener todos los sets separados pero lanza error :c
        this.vida = vida;
        this.magia = magia;
        this.ataque = ataque;
        this.defensa = defensa;
        this.energia = energia;
        this.dinero = dinero;
    }

    public int getVida() {
        return vida;}
    public void setVida(int vida) {
        this.vida = vida;}

    public int getMagia() {
        return magia;}
    public void setMagia(int magia) {
        this.magia = magia;}

    public int getAtaque() {
        return ataque;}
    public void setAtaque(int ataque) {
        this.ataque = ataque;}

    public int getDefensa() {
        return defensa;}
    public void setDefensa(int defensa) {
        this.defensa = defensa;}

    public int getEnergia() {
        return energia;}
    public void setEnergia(int energia) {
        this.energia = energia; }

    public static int getDinero() {
        return dinero;}
    public static void setDinero(int dinero) {
        Personaje.dinero = dinero; }
}
