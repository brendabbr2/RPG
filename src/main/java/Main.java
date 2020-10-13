import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, IOException, InterruptedException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        GUI GUI;
        GUI = new GUI();
        GUI.setVisible(true);
    }

}
