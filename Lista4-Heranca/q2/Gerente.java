public class Gerente extends Funcionario {
    double bonus;
    int timeServ;

    Gerente(String nome, String cpf, double valHourWork, int hourMonth, double bonus, int timeServ) {
        super(nome, cpf, valHourWork, hourMonth);
        this.bonus = bonus;
        this.timeServ = timeServ;
        calculaSalario();
    }

    public void calculaSalario() {
        salario = (valHourWork * hourMonth) + (bonus * timeServ);
    }

    public String toString() {
        return "Gerente de nome " + nome + ", salario " + salario + " e " + timeServ + " anos de serviço";
    }

    public String getCpf() {
        return cpf;
    }
    public double getValHourWork() {
        return valHourWork;
    }
    public int getHourMonth() {
        return hourMonth;
    }

    public double getBonus() {
        return bonus;
    }
}