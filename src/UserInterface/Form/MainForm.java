package UserInterface.Form;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import UserInterface.Style;

public class MainForm extends JFrame {
    FrameMenuPrincipal pnlMenu = new FrameMenuPrincipal();
    JPanel pnlMain = new MainPanel();

    public MainForm(String titleApp) {
        customizeComponent(titleApp);
        pnlMenu.btnHome.addActionListener(e -> setPanel(new MainPanel()));
        pnlMenu.btnIABot.addActionListener(e -> setPanel(new IABotPanel()));
        pnlMenu.btnAntBot.addActionListener(e -> setPanel(new AntBotPanel()));
        pnlMenu.btnHormigaClasificacion.addActionListener(e -> setPanel(new HormigaClasificacionPanel()));
        pnlMenu.btnHormiga.addActionListener(e -> setPanel(new HormigaPanel()));
        pnlMenu.btnMecatronico.addActionListener(e -> setPanel(new MecatronicoPanel()));
        pnlMenu.btnEnsamblado.addActionListener(e -> setPanel(new EnsambladoPanel()));
    }

    private void setPanel(JPanel panel) {
        getContentPane().remove(pnlMain);
        pnlMain = panel;
        getContentPane().add(pnlMain, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void customizeComponent(String titleApp) {
        setTitle(titleApp);
        setSize(930, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(pnlMenu, BorderLayout.WEST);
        container.add(pnlMain, BorderLayout.CENTER);
        setVisible(true);
    }
}