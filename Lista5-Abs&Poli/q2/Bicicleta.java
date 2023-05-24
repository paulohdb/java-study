public class Bicicleta extends Veiculo {
    int aro;
    int nMarchas;

    Bicicleta(String modelo, int aro, int nMarchas) {
        super(2, modelo, 1, 1);
        this.aro = aro;
        this.nMarchas = nMarchas;
    }

    public int getAro() {
        return aro;
    }

    public int getMarchas() {
        return nMarchas;
    }
}