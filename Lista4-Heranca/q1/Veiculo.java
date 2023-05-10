public class Veiculo {
    String modelo;
    int nRodas;
    double peso;
    double velocidade;

    public Veiculo(String modelo, int nRodas, double peso, double velocidade) {
        this.modelo = modelo;
        this.nRodas = nRodas;
        this.peso = peso;
        this.velocidade = velocidade;
    } 

    public void acelerar() {
        velocidade += peso / 2;
    }

    public String toString() {

        return "Veiculo de modelo " + modelo; 
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getPeso() {
        return peso;
    }
    
}   

