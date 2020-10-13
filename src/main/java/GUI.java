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
    private JProgressBar vida;
    private JProgressBar magia;
    private JProgressBar ataque;
    private JProgressBar defensa;
    private JProgressBar energia;
    private JLabel Vida;
    private JLabel Magia;
    private JLabel Ataque;
    private JLabel Defensa;
    private JLabel Energía;
    private JTextField dinero;

    public void mostrarDinero(){
        Personaje personajeObj = new Personaje(0, 0, 0, 0,0,0);
        String plata = Integer.toString(personajeObj.getDinero());
        dinero.setText(plata);
    };


    private JTextField Descripcion_Objeto;
    private JPanel Ganancia;
    private JPanel Stats;
    private JButton comprarItemButton;
    private JButton venderItemButton;
    private JButton cancelarItemButton;
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
    private JPanel tienda1;
    private JPanel tienda2;
    private JPanel tienda3;
    private JPanel tienda4;
    private JPanel tienda5;
    private JPanel tienda6;
    private JPanel tienda7;
    private JPanel tienda8;
    private JButton button1;

    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public GUI(){
        add(rootPanel);
        setTitle("Tienda RPG");
        setSize(850,400);

    }



}
