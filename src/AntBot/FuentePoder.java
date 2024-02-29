package AntBot;

public class FuentePoder {
    private int NivelEnergia;

    public FuentePoder(int nivelEnergia) {
        NivelEnergia = nivelEnergia;
    }

    public int getNivelEnergia() {
        return NivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        NivelEnergia = nivelEnergia;
    }

    public void recargar(){
        System.out.println("La fuente de poder se ha recargado");
        setNivelEnergia(100);
    }

    public void reemplazar(){
        System.out.println("La fuente de poder se ha reemplazado");
        setNivelEnergia(100);
    }
}
