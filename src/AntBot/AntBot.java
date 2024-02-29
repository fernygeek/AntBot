package AntBot;
import EjercitoRuso.ExpertoIngles;
import EjercitoRuso.ExpertoRuso;
import IABot.IABot;

public class AntBot extends IABot{


    private String serieAntBot;

    public String getSerieAntBot() {
        return serieAntBot;
    }
    public void setSerieAntBot(String SerieAntBot) {
        serieAntBot = SerieAntBot;
    }

    private FuentePoder fuentepoder;
    private Ala alas;
    private Pierna piernaDerecha;
    private Pierna piernaIzquierda;
    private Tronco tronco;
    private CircuitoAnillado circuitoAnillado;
    private CircuitoCarga circuitoCarga;
    private Procesador procesador;
    private TransductorFlexion transductorFlexion;
    private Tenazas tenazas;
    private Sensor_Camara sensor_Camara;
    private Antena antenas;
    private Radio radio;
    private ExpertoRuso expertoRuso;
    private ExpertoIngles expertoIngles;
    /**
     * @param iaBot
     * @param string
     */
    public AntBot(IABot iaBot, String serieAntBot){

        super(iaBot);
        this.serieAntBot = serieAntBot;
        fuentepoder = new FuentePoder(100);
        alas = new Ala();
        piernaDerecha = new Pierna();
        piernaIzquierda  = new Pierna();
        tronco = new Tronco();
        circuitoAnillado = new CircuitoAnillado();
        circuitoCarga = new CircuitoCarga();
        procesador = new Procesador();
        transductorFlexion = new TransductorFlexion();
        tenazas = new Tenazas();
        sensor_Camara = new Sensor_Camara();
        antenas = new Antena();
        radio = new Radio();

        expertoRuso = new ExpertoRuso("Vodkavick");
        expertoIngles = new ExpertoIngles("Bellingham");

        System.out.println("---INICIALIZANDO IA RUSA---");
        System.out.println("--APRENDIENDO IDIOMAS PARA EL ANTBOT--");
        Lenguaje(expertoRuso);
        Lenguaje(expertoIngles);

        // IntegrarHormiga("Pepe");
        // IntegrarHormiga(hormiga);
        
        // if (!hormiga.getClasificacionHormiga().equals("Zangano"))
        //     alas.volar(100);
        // else
        //     System.out.println("Solo las hormigas zanganos tienen alas para poder volar.");


        // if (piernaDerecha.EstadoPierna&&piernaIzquierda.EstadoPierna) {
        //     piernaDerecha.saltar(20);
        //     piernaIzquierda.correr(200);
        // }
        // else{
        //     System.out.println("Falta una o ambas piernas");
        // }
    }

    // public void IntegrarHormiga(Hormiga hormiga){
    //     System.out.println("Bienvenido hormiga "+hormiga.getCodigo());
    //     System.out.println("Inicializando la integracion del exobot....");
    // }

    public void Lenguaje(ITecnicoIdioma tecnicoIdioma){

        tecnicoIdioma.Transferirlexico();
        tecnicoIdioma.Transferirgramatica();
        tecnicoIdioma.Transferirfonetica();
    }
}