package IABot;

public class IABot {
    
    private static String nombre;
    private static IABot instance;

    private IABot(){
    }
        protected IABot(IABot iaBot) {
            if(iaBot != null){
                instance = iaBot;
            }
    }

    public static IABot getInstance(String nombre) {
        if (instance == null) {
            instance = new IABot();
            IABot.nombre = nombre;
        }
        return instance;
        }
    
        public String getNombre() {
            return nombre;
        }
}
