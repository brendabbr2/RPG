import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, IOException, InterruptedException {
        //F: Funcion que contiene el llamado permanente a la interfaz
        //E: N/A
        //S: Interfaz grafica GUI
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        GUI GUI;
        GUI = new GUI();
        GUI.setVisible(true);
    }

}
