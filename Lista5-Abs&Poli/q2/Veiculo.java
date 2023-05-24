abstract public class Veiculo {
    int nRodas;
    String modelo;
    int nPass; 
    int maxPass;

    public Veiculo(int nRodas, String modelo, int nPass, int maxPass) {
        this.nRodas = nRodas;
        this.modelo = modelo;
        this.nPass = nPass;
        this.maxPass = maxPass;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNPass() {
        return nPass;
    }

    public boolean incPass() {
        if (nPass < maxPass)
            return true;
        else;
            return false;
    }

    
}