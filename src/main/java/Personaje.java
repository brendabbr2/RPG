public class Personaje {
    //Atributos
    private int vida= 63;
    private int magia= 40;
    private int ataque= 35;
    private int defensa= 67;
    private int energia= 53;
    private static int dinero=1327;


    //Sets
    public Personaje (){
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

    public void validarVida100(int sumaVida){
        if (sumaVida>=100){
            this.vida= 100;
        }else{
            this.vida= sumaVida;
        }
    }
    public void setVidaParametro(String parametroX){
        vida= getVida();
        int cantLetrasBody= parametroX.length();
        int cantLetrasParametro= cantLetrasBody/10;
        validarVida100(vida+cantLetrasBody);

    }

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
