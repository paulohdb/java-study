public class Gerente extends Funcionario {
    double bonus;
    int timeServ;

    Gerente(String nome, String cpf, double valHourWork, int hourMonth, double bonus, int timeServ) {
        this.nome = nome;
        this.cpf = cpf;
        this.valHourWork = valHourWork;
        this.hourMonth = hourMonth;
        this.bonus = bonus;
        this.timeServ = timeServ;
    }

    public void calculaSalario() {
        super.sal = (super.valHourWork * super.hourMonth) + (bonus * timeServ);
    }

    public String toString() {
        return "Gerente de nome " nome + ", salario " + sal + " e " + timeServ + " anos de experiencia";
    }

    public String getCpf() {
        return cpf;

    public double getValHourWork() {
        return valHourWork;
    
    public int getHourMonth() {
        return hourMonth;
    }

    public int getBonus() {
        return bonus;
    }
}
