public class Carro extends Veiculo {

    int nCilindros;

    public Carro(String modelo, double peso, int nCilindros) {

        super
        this.modelo = modelo;
        this.peso = peso;
        this.nCilindros = nCilindros;
    }

    public void acelerar() {
        velocidade = (peso / 2) + nCilindros;
    }

    public String toString() {
        return "Carro de modelo " + modelo + " com " + nCilindros + " cilindros";
    }

    public double getVelocidade() {
        return velocidade;
    }
    
    public double getPeso() {
        return peso;
    }

}