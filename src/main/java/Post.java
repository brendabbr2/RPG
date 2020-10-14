public class Post {
    private int id;
    private int postId;
    private String name;
    private String email;
    private String categoria;
    private String body;
    private Boolean equipado = false;
    private int cantidad=0;
    private Boolean enMochila= false;
    private int cantEnMochila= 0;

    public int getCantEnMochila() {
        return cantEnMochila;
    }

    public void setCantEnMochila(int cantEnMochila) {
        this.cantEnMochila = cantEnMochila;
    }

    public Boolean getEnMochila() {
        return enMochila;
    }

    public void setEnMochila(Boolean enMochila) {
        this.enMochila = enMochila;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getEquipado() {
        return equipado;
    }

    public void setEquipado(Boolean equipado) {
        this.equipado = equipado;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public String getCategoria() {
        int largo = this.getName().length();
        if (largo%2==0){
            categoria= "Comida";
        }else if(largo%3==0){
            categoria="Artilleria";
        }else{
            categoria="Pociones";
        }
        return categoria;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String toString(){
        return "\nCategoria: " + getCategoria() + "\nEnergía: "+ postId + "\nVida: " + id + "\nArtículo: " + email + "\nDescripción: "+ body + "\n";
    }
}
