public class Produto {
    String nome;
    double valor;
    double peso;
    int quantidade;

    Produto(String nNome, double nValor, double nPeso) {

        nome = nNome;
        valor = nValor;
        peso = nPeso;
    }

    Produto(String nNome, double nValor, double nPeso, int quant) {

        nome = nNome;
        valor = nValor;
        peso = nPeso;
        quantidade = quant;
    }

    double devolveValorAgregado() {
        return valor * quantidade;
    }

    double devolvePesoAgregado() {
        return peso * quantidade;
    }

    double converteEmDolares(double cotacaoUSD) {
        return valor / cotacaoUSD;
    }
}
