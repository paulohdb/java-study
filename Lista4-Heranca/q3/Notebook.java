public class Notebook extends Computador {
    
    String fabricante;
    double peso;

    public Notebook(int stor, int RAM, double cpuClock, String fabricante, double peso) {
        super(stor, RAM, cpuClock, true);
        this.fabricante = fabricante;
        this.peso = peso;
    }

    public boolean ehPesado() {
        if (peso > 2.0) {
            return true;
        }
        return false;
    } 
}
