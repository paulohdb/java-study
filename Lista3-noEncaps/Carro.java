class Carro {
    
    String modelo;
    int nPortas;
    int nPassageiros;
    double velocidade;
    boolean estaLigado;

    Carro (String mod, int nP, int nPas) {

        modelo = mod;
        nPortas = nP;
        nPassageiros = nPas;

    }

    void ligaCarro() {
        if (estaLigado == false)
            estaLigado = true;
    } 

    void acelerar(double novaV) {
        if (estaLigado == true)
            velocidade = novaV;
    }

    void frear() {
        velocidade = 0;
    }

    String devolveInformacoes() {

        return("Carro de modelo "  + modelo + " com " + nPassageiros + " passageiros");
    }
}
