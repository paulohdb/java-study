public class Carro extends Veiculo {

    super(modelo, peso, velocidade);
    int nCilindros;

    public Carro(String modelo, double peso, int nCilindros) {

        this.modelo = modelo;
        this.peso = peso;
        this.nCilindros = nCilindros;
    }

    public void acelerar() {
        velocidade = (peso / 2) + nCilindros;
    }

    public String toString() {
        System.out.println("Carro de modelo " + modelo + " com " + nCilindros + " cilindros");
    }
}