public class Funcionario {
    
    String nome;
    String cpf;
    double sal;
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
        sal = valHourWork * hourMonth;
    }

    public String toString() {
        return "Funcionario de nome " + nome + " e salario " + sal;
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
