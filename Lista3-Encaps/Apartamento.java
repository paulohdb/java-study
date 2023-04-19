class Apartamento {
    private int nMoradores;
    private int nQuartos;
    private double espaco;
    private double valorAluguel;

    public Apartamento(int nQuar, double esp, double valorAlg) {
        nQuartos = nQuar;
        espaco = esp;
        valorAluguel = valorAlg;
    }

    public Apartamento(int nMor, int nQuar, double esp, double valorAlg) {
        nMoradores = nMor;
        nQuartos = nQuar;
        espaco = esp;
        valorAluguel = valorAlg;
    }

    public double dividirAluguel() {
        return valorAluguel / nMoradores;
    }

    public double valorporm2() {
        return valorAluguel / espaco;
    }

    // SETTERS \/\/\/\/

    public boolean aumentarMoradores() {

        if (nMoradores < nQuartos) {
            nMoradores += 1;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean diminuirMoradores() {

        if (nMoradores > 0) {
            nMoradores -= 1;
            return true;
        }
        else {
            return false;
        }
    }

    public void setValorAluguel(double valorAluguel) {

        this.valorAluguel = valorAluguel;
    }

    // GETTERS \/\/\/\/

    public int getnMoradores() {
        return nMoradores;
    }

    public int getnQuartos() {
        return nQuartos;
    }

    public double getEspaco() {
        return espaco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }
    
}
