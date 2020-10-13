public class Post {
    private int id;
    private int postId;
    private String name;
    private String email;
    private String categoria;
    private String body;
    private Boolean equipado = false;


    public Boolean getEquipado() {
        return equipado;
    }

    public void setEquipado(Boolean equipado) {
        this.equipado = equipado;
    }



    public String getCategoria() {
        int valorDado= (int) Math.floor(Math.random()*4);
        if (valorDado==1){
            categoria= "Comida";
        }else if(valorDado==2){
            categoria="Artilleria";
        }else{
            categoria="Pociones";
        }
        return categoria;
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



    public void setBody(String body) {
        this.body = body;
    }

    public String toString(){
        return "\nCategoria: " + getCategoria() + "\nEnergía: "+ postId + "\nVida: " + id + "\nArtículo: " + email + "\nDescripción: "+ body + "\n";
    }
}
