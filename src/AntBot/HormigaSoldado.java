package AntBot;

public class HormigaSoldado extends Hormiga  {

    public HormigaSoldado(String codigoUnico, String clasificacion) {
        super(codigoUnico, clasificacion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void realizarTarea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarTarea'");
    }
    
    public void  defenderColonia(){
         System.out.println ("La hormiga " + this.getCodigoUnico()+ " se encuentra en la columna de defensa.");
    }


}
