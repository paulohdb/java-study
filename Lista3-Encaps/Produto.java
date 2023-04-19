public class Produto {
    private String nome;
    private double valor;
    private double peso;
    private int quantidade;

    public Produto(String nNome, double nValor, double nPeso) {

        nome = nNome;
        valor = nValor;
        peso = nPeso;
    }

    public Produto(String nNome, double nValor, double nPeso, int quant) {

        nome = nNome;
        valor = nValor;
        peso = nPeso;
        quantidade = quant;
    }

    public double devolveValorAgregado() {
        return valor * quantidade;
    }

    public double devolvePesoAgregado() {
        return peso * quantidade;
    }

    double converteEmDolares(double cotacaoUSD) {
        return valor /cotacaoUSD;
    }

    public String getNome(){
        return nome;
    }

    public double getValor(){
        return valor;
    }

    public double getPeso(){
        return peso;
    }

    public int getQuantidade(){
        return quantidade;
    }
}
