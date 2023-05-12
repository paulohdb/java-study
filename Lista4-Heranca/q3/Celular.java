public class Celular extends Computador {
    
    double sizeScreen;
    String model;
    int numApps;

    public Celular(int stor, int RAM, double cpuClock, double sizeScreen, String model, int numApps) {
        super(stor, RAM, cpuClock, false);
        this.sizeScreen = sizeScreen;
        this.model = model;
        this.numApps = numApps;

    }

    public boolean instalaApp() {
        if ((numApps * 2) < stor) {
            numApps += 1;
            return true;
        }

        return false;
    }
}
