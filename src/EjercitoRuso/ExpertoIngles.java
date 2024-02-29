package EjercitoRuso;
import AntBot.ITecnicoIdioma;

public class ExpertoIngles extends Humano implements ITecnicoIdioma{

    public ExpertoIngles(String nombre) {
        super(nombre);
    }

    @Override
    public void Transferirlexico() {
        System.out.println("Lexico en ingles cargado correctamente");
    }

    @Override
    public void Transferirgramatica() {
        System.out.println("Gramatica en ingles cargada correctamente");
    }

    @Override
    public void Transferirfonetica() {
        System.out.println("Fonetica en ingles cargada correctamente");
    }
}
