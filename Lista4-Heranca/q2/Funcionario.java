public class Funcionario {
    
    String nome;
    String cpf;
    double salario;
    double valHourWork;
    int hourMonth;

    Funcionario(String nome, String cpf, double valHourWork, int hourMonth) {
        this.nome = nome;
        this.cpf = cpf;
        this.valHourWork = valHourWork;
        this.hourMonth = hourMonth;
        calculaSalario();
    }

    public void calculaSalario() {
        salario = valHourWork * hourMonth;
    }

    public String toString() {
        return "Funcionario de nome " + nome + " e salario " + salario;
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

}

