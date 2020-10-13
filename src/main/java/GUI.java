import javax.swing.*;


public class GUI {
    public static class productos {
        intentoAPI productosVenta = new intentoAPI();
        System.out.println(productosVenta);

    }

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
    private JTextField dinero; {
        int cantidad = Personaje.getDinero();
        System.out.println(cantidad);
        dinero.setText(String.valueOf(cantidad));
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

    public GUI() {
    }
}
