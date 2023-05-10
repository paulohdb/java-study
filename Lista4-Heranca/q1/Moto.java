public class Moto extends Veiculo {
    String cor;
    double comprimento;

    public Moto(String modelo, double peso, double comprimento, String cor) {

        this.modelo = modelo;
        this.peso = peso;
        this.comprimento = comprimento;
        this.cor = cor;
    }

    public void acelerar() {
        velocidade = (peso / 2) - comprimento;
    }

    public String toString() {
        return "Veiculo de modelo " + modelo + " e cor " + cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getPeso() {
        return peso;
    }

    public double getComprimento() {
        return comprimento;
    }
}