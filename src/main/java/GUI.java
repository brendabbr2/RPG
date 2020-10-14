import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.List;


public class GUI extends JFrame implements ActionListener{
    private JPanel rootPanel;
    private JPanel Descripcion;
    private JPanel Acciones;
    private JScrollPane Items;
    private JLabel Dinero;
    private JLabel Vida;
    private JLabel Magia;
    private JLabel Ataque;
    private JLabel Defensa;
    private JLabel Energía;
    private JTextField dinero;
    private JTextField Descripcion_Objeto;
    private JPanel Ganancia;
    private JPanel Stats;
    private JButton comprarItemButton;
    private JButton venderItemButton;
    private JTextField Poseer;
    private JTextField Cantidad;
    private JTextField nuevoVida;
    private JTextField nuevoMagia;
    private JTextField nuevoAtaque;
    private JTextField nuevoDefensa;
    private JTextField nuevoEnergia;
    private JTextField Nombre_Objeto;
    private JButton Inventario;
    private JButton Tienda;
    private JButton equiparItemButton;
    private JButton equipadoButton;
    private JButton desequiparItemButton;
    private JPanel DineroPanel;
    private JPanel DineroPanel2;
    private JPanel tienda1Panel;
    private JPanel tienda2Panel;
    private JPanel tienda3Panel;
    private JPanel tienda4Panel;
    private JPanel tienda5Panel;
    private JPanel tienda6Panel;
    private JPanel tienda7Panel;
    private JPanel tienda8Panel;
    private JButton tienda1Boton;
    private JButton tienda2Boton;
    private JButton tienda3Boton;
    private JButton tienda4Boton;
    private JButton tienda5Boton;
    private JButton tienda6Boton;
    private JButton tienda7Boton;
    private JButton tienda8Boton;
    private JButton TiendaBoton;
    private JTextField actualMagia;
    private JTextField actualAtaque;
    private JTextField actualDefensa;
    private JTextField actualEnergia;
    private JTextField cambioVida;
    private JTextField cambioMagia;
    private JTextField cambioAtaque;
    private JTextField cambioDefensa;
    private JTextField cambioEnergia;
    private JTextField actualVida;
    private JTextField espacioCategoria;
    private JTextField Categoria;
    private JTextField estaEquipado;
    private JProgressBar progressBar1;

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    Personaje Meloria = new Personaje();
    public int sumaValores(int actual, int adicion){
        int sumaValores= 0;
        sumaValores= actual + adicion;
        if (sumaValores>=100){
            return 100;
        }else{
            return sumaValores;
        }

    }
    public int restaValores(int actual, int adicion){
        int sumaValores= 0;
        sumaValores= actual - adicion;
        if (sumaValores<=0){
            return 0;
        }else{
            return sumaValores;
        }

    }

    public void actualizarStatsGrafico(Post objeto){
        //F: Actualiza los porcentajes presentados en las barras de los stats.
        //E: Objeto de clase Post.
        //S: Labels de stats modificados.
        int largoString= objeto.getBody().length()/10;
        cambioAtaque.setText("");
        nuevoAtaque.setText("");
        cambioDefensa.setText("");
        nuevoDefensa.setText("");
        cambioVida.setText("");
        nuevoVida.setText("");
        cambioMagia.setText("");
        nuevoMagia.setText("");
        cambioEnergia.setText("");
        nuevoEnergia.setText("");

        actualVida.setText(String.valueOf(Meloria.getVida()));
        actualAtaque.setText(String.valueOf(Meloria.getAtaque()));
        actualDefensa.setText(String.valueOf(Meloria.getDefensa()));
        actualMagia.setText(String.valueOf(Meloria.getMagia()));
        actualEnergia.setText(String.valueOf(Meloria.getEnergia()));

        if(objeto.getCategoria().equals("Comida")){
            cambioVida.setText("+" + largoString);
            nuevoVida.setText(String.valueOf(sumaValores(Meloria.getVida(), largoString)));

        }else if(objeto.getCategoria().equals("Artilleria")){
            cambioAtaque.setText("+" + objeto.getEmail().length());
            nuevoAtaque.setText(String.valueOf(sumaValores(Meloria.getAtaque(), objeto.getEmail().length())));

            cambioDefensa.setText("+" + (objeto.getEmail().length()*3)/5);
            nuevoDefensa.setText(String.valueOf(sumaValores(Meloria.getDefensa(), (objeto.getEmail().length()*3)/5)));

        }else{
            cambioMagia.setText("+" + objeto.getId()*3);
            nuevoMagia.setText(String.valueOf(sumaValores(Meloria.getMagia(), objeto.getId()*3)));

            cambioEnergia.setText("+" + objeto.getEmail().length()*2);
            nuevoEnergia.setText(String.valueOf(sumaValores(Meloria.getAtaque(), objeto.getEmail().length()*2)));
        }
    }




    public GUI() throws IOException, InterruptedException {
        //F: Construccion de la interfaz grafica.
        //E: Solicita la global ddel Personaje.
        //S: Funciones que estan dentro de los botones del JFrame.

        Nombre_Objeto.setEditable(false);
        Categoria.setEditable(false);
        espacioCategoria.setEditable(false);
        Descripcion_Objeto.setEditable(false);
        Poseer.setEditable(false);
        Cantidad.setEditable(false);
        dinero.setEditable(false);
        actualVida.setEditable(false);
        nuevoVida.setEditable(false);
        cambioVida.setEditable(false);
        actualAtaque.setEditable(false);
        nuevoAtaque.setEditable(false);
        cambioAtaque.setEditable(false);
        actualDefensa.setEditable(false);
        nuevoDefensa.setEditable(false);
        cambioDefensa.setEditable(false);
        actualEnergia.setEditable(false);
        nuevoEnergia.setEditable(false);
        cambioEnergia.setEditable(false);
        actualMagia.setEditable(false);
        nuevoMagia.setEditable(false);
        cambioMagia.setEditable(false);

        List<Post> posts = intentoAPI.devolverValor();

        add(rootPanel);
        setTitle("Tienda RPG");
        setSize(1100, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tienda1Boton.setText(posts.get(1).getName().substring(1, 10));
        tienda1Boton.setSize(20, 10);
        tienda2Boton.setText(posts.get(2).getName().substring(1, 10));
        tienda2Boton.setSize(50, 10);
        tienda3Boton.setText(posts.get(3).getName().substring(1, 10));
        tienda3Boton.setSize(50, 10);
        tienda4Boton.setText(posts.get(4).getName().substring(1, 10));
        tienda4Boton.setSize(100, 10);
        tienda5Boton.setText(posts.get(5).getName().substring(1, 10));
        tienda5Boton.setSize(100, 10);
        tienda6Boton.setText(posts.get(6).getName().substring(1, 10));
        tienda6Boton.setSize(100, 10);
        tienda7Boton.setText(posts.get(7).getName().substring(1, 10));
        tienda7Boton.setSize(100, 10);
        tienda8Boton.setText(posts.get(8).getName().substring(1, 10));
        tienda8Boton.setSize(100, 10);

        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinero.setText(String.valueOf(Meloria.getDinero()));
                dinero.setEditable(false);//Si no sirve es por esta linea
            }
        };

        Timer timer = new Timer(100, task);
        timer.setRepeats(true);
        timer.start();

        tienda1Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String estaEquipadoAux="";
                if(posts.get(1).getEnMochila()==false){
                    estaEquipado.setText("Este articulo no esta equipado");
                }else{
                    estaEquipado.setText("Este articulo esta equipado.");
                }
                espacioCategoria.setText(posts.get(1).getCategoria());
                actualizarStatsGrafico(posts.get(1));

                Nombre_Objeto.setText(posts.get(1).getName().substring(1, 10));
                Nombre_Objeto.setEditable(false);
                Descripcion_Objeto.setText(posts.get(1).getBody());
                Descripcion_Objeto.setEditable(false);

                Boolean confirmar = posts.get(1).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(1).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Cantidad.setText(String.valueOf(posts.get(1).getEmail().length() * 7));
                Cantidad.setEditable(false);
                Poseer.setEditable(false);
            }
        });
        tienda2Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(posts.get(2).getEnMochila()==false){
                    estaEquipado.setText("Este articulo no esta equipado");
                }else{
                    estaEquipado.setText("Este articulo esta equipado.");
                }
                espacioCategoria.setEditable(false);
                Categoria.setEditable(false);


                espacioCategoria.setText(posts.get(2).getCategoria());

                actualizarStatsGrafico(posts.get(2));

                Nombre_Objeto.setText(posts.get(2).getName().substring(1, 10));
                Nombre_Objeto.setEditable(false);
                Descripcion_Objeto.setText(posts.get(2).getBody());
                Descripcion_Objeto.setEditable(false);
                Boolean confirmar = posts.get(2).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(2).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Poseer.setEditable(false);
                Cantidad.setText(String.valueOf(posts.get(2).getEmail().length() * 7));
                Cantidad.setEditable(false);
            }
        });
        tienda3Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(posts.get(3).getEnMochila()==false){
                    estaEquipado.setText("Este articulo no esta equipado");
                }else{
                    estaEquipado.setText("Este articulo esta equipado.");
                }
                espacioCategoria.setText(posts.get(3).getCategoria());

                actualizarStatsGrafico(posts.get(3));

                Nombre_Objeto.setText(posts.get(3).getName().substring(1, 10));
                Nombre_Objeto.setEditable(false);
                Descripcion_Objeto.setText(posts.get(3).getBody());
                Descripcion_Objeto.setEditable(false);
                Boolean confirmar = posts.get(3).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(3).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Cantidad.setText(String.valueOf(posts.get(3).getEmail().length() * 7));
            }
        });
        tienda4Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(posts.get(4).getEnMochila()==false){
                    estaEquipado.setText("Este articulo no esta equipado");
                }else{
                    estaEquipado.setText("Este articulo esta equipado.");
                }
                espacioCategoria.setText(posts.get(4).getCategoria());
                actualizarStatsGrafico(posts.get(4));

                Nombre_Objeto.setText(posts.get(4).getName().substring(1, 10));
                Nombre_Objeto.setEditable(false);
                Descripcion_Objeto.setText(posts.get(4).getBody());
                Descripcion_Objeto.setEditable(false);
                Boolean confirmar = posts.get(4).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(4).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Poseer.setEditable(false);
                Cantidad.setText(String.valueOf(posts.get(4).getEmail().length() * 7));
                Cantidad.setEditable(false);
            }
        });
        tienda5Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(posts.get(5).getEnMochila()==false){
                    estaEquipado.setText("Este articulo no esta equipado");
                }else{
                    estaEquipado.setText("Este articulo esta equipado.");
                }
                espacioCategoria.setText(posts.get(5).getCategoria());
                actualizarStatsGrafico(posts.get(5));

                Nombre_Objeto.setText(posts.get(5).getName().substring(1, 10));
                Nombre_Objeto.setEditable(false);
                Descripcion_Objeto.setText(posts.get(5).getBody());
                Descripcion_Objeto.setEditable(false);
                Boolean confirmar = posts.get(5).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(5).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Poseer.setEditable(false);
                Cantidad.setText(String.valueOf(posts.get(5).getEmail().length() * 7));
                Cantidad.setEditable(false);
            }
        });
        tienda6Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(posts.get(6).getEnMochila()==false){
                    estaEquipado.setText("Este articulo no esta equipado");
                }else{
                    estaEquipado.setText("Este articulo esta equipado.");
                }
                espacioCategoria.setText(posts.get(6).getCategoria());
                actualizarStatsGrafico(posts.get(6));

                Nombre_Objeto.setText(posts.get(6).getName().substring(1, 10));
                Nombre_Objeto.setEditable(false);
                Descripcion_Objeto.setText(posts.get(6).getBody());
                Descripcion_Objeto.setEditable(false);
                Boolean confirmar = posts.get(6).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(6).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Poseer.setEditable(false);
                Cantidad.setText(String.valueOf(posts.get(6).getEmail().length() * 7));
                Cantidad.setEditable(false);
            }
        });
        tienda7Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(posts.get(7).getEnMochila()==false){
                    estaEquipado.setText("Este articulo no esta equipado");
                }else{
                    estaEquipado.setText("Este articulo esta equipado.");
                }
                espacioCategoria.setText(posts.get(7).getCategoria());
                actualizarStatsGrafico(posts.get(7));

                Nombre_Objeto.setText(posts.get(7).getName().substring(1, 10));
                Nombre_Objeto.setEditable(false);
                Descripcion_Objeto.setText(posts.get(7).getBody());
                Descripcion_Objeto.setEditable(false);
                Boolean confirmar = posts.get(7).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(7).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Poseer.setEditable(false);
                Cantidad.setText(String.valueOf(posts.get(7).getEmail().length() * 7));
                Cantidad.setEditable(false);
            }
        });
        tienda8Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(posts.get(8).getEnMochila()==false){
                    estaEquipado.setText("Este articulo no esta equipado");
                }else{
                    estaEquipado.setText("Este articulo esta equipado.");
                }
                espacioCategoria.setText(posts.get(8).getCategoria());
                actualizarStatsGrafico(posts.get(8));

                Nombre_Objeto.setText(posts.get(8).getName().substring(1, 10));
                Nombre_Objeto.setEditable(false);
                Descripcion_Objeto.setText(posts.get(8).getBody());
                Descripcion_Objeto.setEditable(false);
                Boolean confirmar = posts.get(8).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(8).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Poseer.setEditable(false);
                Cantidad.setText(String.valueOf(posts.get(8).getEmail().length() * 7));
                Cantidad.setEditable(false);
            }
        });

        comprarItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 9; i++) {
                    if (posts.get(i).getName().substring(1, 10).equals(Nombre_Objeto.getText())) {
                        if (Meloria.getDinero() > posts.get(i).getEmail().length() * 7) {
                            posts.get(i).setEquipado(true);
                            posts.get(i).setCantidad(posts.get(i).getCantidad() + 1);
                            Meloria.setDinero((Meloria.getDinero()) - (posts.get(i).getEmail().length() * 7));
                            Boolean confirmar = posts.get(i).getEquipado();
                            String respuesta;
                            if (confirmar == true) {
                                respuesta = posts.get(i).getCantidad() + " adquiridos.";
                            } else {
                                respuesta = "No posee el articulo.";
                            }
                            Poseer.setText(respuesta);
                            JOptionPane.showMessageDialog(null, "Artículo comprado por " + (posts.get(i).getEmail().length() * 7) + " lorías.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Usted no posee suficiente dinero para comprar el producto.");
                        }
                    }
                }

            }
        });

        venderItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 9; i++) {
                    if (posts.get(i).getName().substring(1, 10).equals(Nombre_Objeto.getText())) {
                        if (posts.get(i).getEquipado() == true) {
                            if(posts.get(i).getEnMochila()==false){
                                estaEquipado.setText("Este articulo no esta equipado");
                            }else{
                                estaEquipado.setText("Este articulo esta equipado.");
                            }
                            if (posts.get(i).getCantidad() > 1) {
                                posts.get(i).setCantidad(posts.get(i).getCantidad() - 1);
                            } else {
                                posts.get(i).setEquipado(false);
                            }
                            Meloria.setDinero((Meloria.getDinero()) + (posts.get(i).getEmail().length() * 5));

                            Boolean confirmar = posts.get(i).getEquipado();
                            String respuesta;

                            if (confirmar == true) {
                                respuesta = posts.get(i).getCantidad() + " adquiridos.";
                            } else {
                                respuesta = "No posee el articulo.";
                            }
                            Poseer.setText(respuesta);
                            posts.get(i).setCantEnMochila(posts.get(i).getCantidad());

                            JOptionPane.showMessageDialog(null, "Articulo vendido por: " + (posts.get(i).getEmail().length() * 5) + " lorías.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Usted no posee este articulo.");
                        }
                    }
                }

            }
        });
        equiparItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 9; i++) {
                    if (posts.get(i).getName().substring(1, 10).equals(Nombre_Objeto.getText())) {
                        if (posts.get(i).getEquipado() == true) {
                            posts.get(i).setEnMochila(true);
                            if(posts.get(i).getEnMochila()==false){
                                estaEquipado.setText("Este articulo no esta equipado");
                            }else{
                                estaEquipado.setText("Este articulo esta equipado.");
                            }

                            if(posts.get(i).getCategoria().equals("Comida")){
                                Meloria.setVida(sumaValores(Meloria.getVida(), posts.get(i).getBody().length()/10));

                            }else if(posts.get(i).getCategoria().equals("Artilleria")){
                                Meloria.setAtaque(sumaValores(posts.get(i).getEmail().length(), Meloria.getAtaque()));
                                Meloria.setDefensa(sumaValores((posts.get(i).getEmail().length()*3)/5, Meloria.getDefensa()));

                            }else{
                                Meloria.setMagia(sumaValores(posts.get(i).getId()*3, Meloria.getMagia()));
                                Meloria.setEnergia(sumaValores(posts.get(i).getEmail().length()*2, Meloria.getEnergia()));
                            }
                            actualizarStatsGrafico(posts.get(i));

                            JOptionPane.showMessageDialog(null, "Articulo equipado.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Usted no posee este articulo.");
                        }
                    }
                }

            }
        });
        desequiparItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 9; i++) {
                    if (posts.get(i).getName().substring(1, 10).equals(Nombre_Objeto.getText())) {
                        if (posts.get(i).getEnMochila() == true) {
                            posts.get(i).setEnMochila(false);
                            if(posts.get(i).getEnMochila()==false){
                                estaEquipado.setText("Este articulo no esta equipado");
                            }else{
                                estaEquipado.setText("Este articulo esta equipado.");
                            }

                            if(posts.get(i).getCategoria().equals("Comida")){
                                Meloria.setVida(restaValores(Meloria.getVida(), posts.get(i).getBody().length()/10));

                            }else if(posts.get(i).getCategoria().equals("Artilleria")){
                                Meloria.setAtaque(restaValores( Meloria.getAtaque(), posts.get(i).getEmail().length()));
                                Meloria.setDefensa(restaValores(Meloria.getDefensa(),(posts.get(i).getEmail().length()*3)/5 ));

                            }else{
                                Meloria.setMagia(restaValores(Meloria.getMagia(), posts.get(i).getId()*3));
                                Meloria.setEnergia(restaValores(Meloria.getEnergia(), posts.get(i).getEmail().length()*2));
                            }
                            actualizarStatsGrafico(posts.get(i));

                            JOptionPane.showMessageDialog(null, "Articulo desequipado.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Usted no posee este articulo equipado.");
                        }
                    }
                }

            }
        });

        Inventario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //F: Muestra un cuadro de dialogo con una lista de elementos en inventario
                //E: Elementos de la funcionalidad
                //S: Cuadro de dialogo.
                String inforInventario = "Usted posee los siguientes artículos:\n\n";

                for (int i = 0; i < 9; i++) {
                    if (posts.get(i).getEquipado()) {
                        if (posts.get(i).getEquipado() == true) {
                            inforInventario += "Nombre: " + posts.get(i).getName().substring(1, 10) + "\n\tCantidad= " + posts.get(i).getCantidad() + "\n";
                        }
                    }
                }
                if (inforInventario.equals("Usted posee los siguientes artículos:\n\n")) {
                    inforInventario = "Usted no posee artículos aún";
                }
                JOptionPane.showMessageDialog(null, inforInventario);

            }
        });
        TiendaBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //F: Setea todos los espacios de los botones a habilitados.
                //E: las instanciaciones de los elementos
                //S: Botones habilitados.

                tienda1Boton.setEnabled(true);
                tienda2Boton.setEnabled(true);
                tienda3Boton.setEnabled(true);
                tienda4Boton.setEnabled(true);
                tienda5Boton.setEnabled(true);
                tienda6Boton.setEnabled(true);
                tienda7Boton.setEnabled(true);
                tienda8Boton.setEnabled(true);

            }
        });
        equipadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //F: Muestra un cuadro de dialogo con los elementos que puede guardar el Personaje.
                //E: La instanciacion de los elementos dentro del JFrame
                //S: Interfaz grafica con las funcionalidades.
                String inforInventario = "Usted posee los siguientes artículos:\n\n";

                for (int i = 0; i < 9; i++) {
                    if (posts.get(i).getEquipado()) {
                        if (posts.get(i).getEnMochila() == true) {
                            inforInventario += "Nombre: " + posts.get(i).getName().substring(1, 10) + "\n";
                        }
                    }
                }
                if (inforInventario.equals("Usted posee los siguientes artículos:\n\n")) {
                    inforInventario = "Usted no posee artículos aún";
                }
                JOptionPane.showMessageDialog(null, inforInventario);

            }
        });

    }

    public static void main(String[] args) {
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}