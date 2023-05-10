public class Computador {
    int stor;
    int RAM;
    double cpuClock;
    boolean resfActive;

    public void setRam(int RAM) {
        this.RAM = RAM;
    }

    public void setStor(int stor) {
        this.stor = stor;
    }

    Computador(int stor, int RAM, double cpuClock, boolean resfActive) {
        this.stor = stor;
        this.RAM = RAM;
        this.cpuClock = cpuClock;
        this.resfActive = resfActive;
    }
}
