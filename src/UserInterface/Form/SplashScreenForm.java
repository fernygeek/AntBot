package UserInterface.Form;

/*
|--------------------------------------|
| (©)2k24 EPN-FIS, All right reserved. |       
|                                      |
|isabellahq29@gmail.com       lalabell |
|______________________________________|
Autor: lalabell
Fecha: 25/02/1014
Creación del Splash
*/

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import UserInterface.Style;

public abstract class SplashScreenForm {
    private static JFrame       frmSplash;
    private static JProgressBar prbLoaging;
    private static ImageIcon    icoImagen ;
    private static JLabel       lblSplash ;

    public static void show() {
        icoImagen  = new ImageIcon(Style.URL_SPLASH);
        lblSplash  = new JLabel(icoImagen);
        
        prbLoaging = new JProgressBar(0, 100);
        prbLoaging.setStringPainted(true);
        
        frmSplash = new JFrame("Splash Screen");
        frmSplash.setUndecorated(true);
        frmSplash.getContentPane().add(lblSplash, BorderLayout.CENTER);
        frmSplash.add(prbLoaging, BorderLayout.SOUTH);
        frmSplash.setSize(icoImagen.getIconWidth(), icoImagen.getIconHeight());
        frmSplash.setLocationRelativeTo(null); 
        frmSplash.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(40); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            prbLoaging.setValue(i);
        }
        frmSplash.setVisible(false);
    }
}
