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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
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
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JProgressBar progressBar1;

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public GUI() throws IOException, InterruptedException {
        List<Post> posts = intentoAPI.devolverValor();

        add(rootPanel);
        setTitle("Tienda RPG");
        setSize(850, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Personaje Meloria = new Personaje();

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
            }
        };
        Timer timer = new Timer(100, task);
        timer.setRepeats(true);
        timer.start();

        tienda1Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombre_Objeto.setText(posts.get(1).getName().substring(1, 10));
                Descripcion_Objeto.setText(posts.get(1).getBody());
                Boolean confirmar = posts.get(1).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(1).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Cantidad.setText(String.valueOf(posts.get(1).getEmail().length() * 7));
            }
        });
        tienda2Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombre_Objeto.setText(posts.get(2).getName().substring(1, 10));
                Descripcion_Objeto.setText(posts.get(2).getBody());
                Boolean confirmar = posts.get(2).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(2).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Cantidad.setText(String.valueOf(posts.get(2).getEmail().length() * 7));
            }
        });
        tienda3Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombre_Objeto.setText(posts.get(3).getName().substring(1, 10));
                Descripcion_Objeto.setText(posts.get(3).getBody());
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
                Nombre_Objeto.setText(posts.get(4).getName().substring(1, 10));
                Descripcion_Objeto.setText(posts.get(4).getBody());
                Boolean confirmar = posts.get(4).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(4).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Cantidad.setText(String.valueOf(posts.get(4).getEmail().length() * 7));
            }
        });
        tienda5Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombre_Objeto.setText(posts.get(5).getName().substring(1, 10));
                Descripcion_Objeto.setText(posts.get(5).getBody());
                Boolean confirmar = posts.get(5).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(5).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Cantidad.setText(String.valueOf(posts.get(5).getEmail().length() * 7));
            }
        });
        tienda6Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombre_Objeto.setText(posts.get(6).getName().substring(1, 10));
                Descripcion_Objeto.setText(posts.get(6).getBody());
                Boolean confirmar = posts.get(6).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(6).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Cantidad.setText(String.valueOf(posts.get(6).getEmail().length() * 7));
            }
        });
        tienda7Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombre_Objeto.setText(posts.get(7).getName().substring(1, 10));
                Descripcion_Objeto.setText(posts.get(7).getBody());
                Boolean confirmar = posts.get(7).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(7).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Cantidad.setText(String.valueOf(posts.get(7).getEmail().length() * 7));
            }
        });
        tienda8Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombre_Objeto.setText(posts.get(8).getName().substring(1, 10));
                Descripcion_Objeto.setText(posts.get(8).getBody());
                Boolean confirmar = posts.get(8).getEquipado();
                String respuesta;
                if (confirmar == true) {
                    respuesta = "Ya posee el articulo " + posts.get(8).getCantidad() + " vez(veces).";
                } else {
                    respuesta = "No posee el articulo.";
                }
                Poseer.setText(respuesta);
                Cantidad.setText(String.valueOf(posts.get(8).getEmail().length() * 7));
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

        progressBar1.addComponentListener(new ComponentAdapter() {
        });
        textField7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }


    public static void main(String[] args) {

    }



}
