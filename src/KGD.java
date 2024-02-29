import EjercitoRuso.Mecatronico;
import AntBot.AntBot;
import EjercitoRuso.Hormiga;
import IABot.IABot;

public class KGD {
    public void iniciar(){
        IABot iabot =  IABot.getInstance("IA-RUSA");
        AntBot  antbot1 = new AntBot(iabot, "1");
        AntBot  antbot2 = new AntBot(iabot, "2");
        AntBot  antbot3 = new AntBot(iabot, "3");
        Mecatronico m1 = new Mecatronico("Mecatronico");
        Hormiga hormiga1 = new Hormiga("Zangano", "123");
        Hormiga hormiga2 = new Hormiga("Soldado", "456");
        Hormiga hormiga3 = new Hormiga("Rastreadora","789");
        Hormiga hormiga4 = new Hormiga("Larva","000");
        Hormiga hormiga5 = new Hormiga("Reina","999");
        System.out.println("---EJERCITO LISTO---");
        m1.ensamblar(hormiga1, antbot1, iabot);
        m1.ensamblar(hormiga2, antbot2, iabot);
        m1.ensamblar(hormiga3, antbot3, iabot);
    }
}