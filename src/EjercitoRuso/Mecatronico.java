package EjercitoRuso;
import AntBot.AntBot;
import IABot.IABot;

public class Mecatronico extends Humano{

    public Mecatronico(String nombre) {
        super(nombre);
    }

    public void ensamblar(Hormiga hormiga, AntBot antbot, IABot ia){
        System.out.println("--GUERRERO RUSO ENSAMBLADO--");
        System.out.println("-DETALLES-");
        System.out.println("Clasificacion de la hormiga: " + hormiga.getClasificacionHormiga()
                            +"\nCodigo de la hormiga: " + hormiga.getCodigo()
                            +"\nCodigo del AntBot: " + antbot.getSerieAntBot());
    }
}
