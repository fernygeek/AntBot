package EjercitoRuso;
import AntBot.ITecnicoIdioma;

public class ExpertoRuso extends Humano implements ITecnicoIdioma {

    public ExpertoRuso(String nombre) {
        super(nombre);
    }

    @Override
    public void Transferirlexico() {
        System.out.println("Lexico en ruso cargado correctamente");
    }

    @Override
    public void Transferirgramatica() {
        System.out.println("Gramatica en ruso cargada correctamente");
    }

    @Override
    public void Transferirfonetica() {
        System.out.println("Fonetica en ruso cargada correctamente");
    }
}
