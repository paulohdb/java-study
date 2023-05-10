public class Celular extends Computador {
    
    double sizeScreen;
    String model;
    int numApps;

    Celular()

    public boolean instalaApp() {
        if ((numApps * 2) < RAM) {
            numApps += 1;
            return true;
        }

        return false;
    }
}
