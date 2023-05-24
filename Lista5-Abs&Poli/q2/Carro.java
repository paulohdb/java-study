public class Carro extends Veiculo {
    String combustivel;
    int potencia;
    
    public Carro(String modelo, String combustivel, int potencia) {
        super(4, modelo, 5, 5);
        this.combustivel = combustivel;
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public int getPotencia() { 
        return potencia;
    } 
}