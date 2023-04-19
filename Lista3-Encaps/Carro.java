class Carro {
    
    private String modelo;
    private int nPortas;
    private int nPassageiros;
    private double velocidade;
    private boolean estaLigado;

    Carro (String mod, int nP, int nPas) {
        modelo = mod;
        nPortas = nP;
        nPassageiros = nPas;
    }

    public void ligaCarro() {
        if (estaLigado == false)
            estaLigado = true;
    } 

    public void acelerar(double novaV) {
        if (estaLigado == true)
            velocidade = novaV;
    }

    public void frear() {
        velocidade = 0;
    }

    public String devolveInformacoes() {
        return("Carro de modelo "  + modelo + " com " + nPassageiros + " passageiros");
    }

    public String getModel() {
        return modelo;
    }

    public int getnPortas() {
        return nPortas;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }

    public boolean getestaLigado() {
        return estaLigado;
    }

    public double getVelocidade() {
        return velocidade;
    }
}
