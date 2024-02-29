package UserInterface.Form;

import UserInterface.Style;
import UserInterface.CustomerControl.PatButton;

import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameMenuPrincipal extends JPanel {
    public  PatButton
            btnHome   = new PatButton("HOME"),
            btnIABot     = new PatButton("IABOT"),
            btnAntBot     = new PatButton("AntBot"),
            btnHormigaClasificacion     = new PatButton("HORMIGA CLASIFICACION"),
            btnHormiga     = new PatButton("HORMIGA"),
            btnMecatronico    = new PatButton("MECATRONICO"),
            btnEnsamblado    = new PatButton("ENSAMBLADO");

    public FrameMenuPrincipal(){
        customizeComponent();
    }

    private void customizeComponent() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(250, getHeight())); 

        // add-logo
        try {
            Image logo = ImageIO.read(Style.URL_LOGO);
            logo = logo.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            add(new JLabel(new ImageIcon(logo)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // add-botones
        add(btnHome);
        add(btnIABot);
        add(btnAntBot);
        add(btnHormigaClasificacion);
        add(btnHormiga);
        add(btnMecatronico);
        add(btnEnsamblado);

        // add-copyright
        add(new JLabel("\u00A9 2024 POLITINDER"));
    }
}
