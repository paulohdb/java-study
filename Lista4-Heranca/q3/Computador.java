public class Computador {
    int stor;
    int RAM;
    double cpuClock;
    boolean resfriamentoAtivo = false;

    Computador(int stor, int RAM, double cpuClock, boolean resfriamentoAtivo) {
        this.stor = stor;
        this.RAM = RAM;
        this.cpuClock = cpuClock;
        this.resfriamentoAtivo = resfriamentoAtivo;
    }

    public void setRam(int RAM) {
        this.RAM = RAM;
    }

    public void setStor(int stor) {
        this.stor = stor;
    }

}
