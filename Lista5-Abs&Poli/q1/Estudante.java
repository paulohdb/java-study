public class Estudante extends Pessoa {
    String RGA;

    Estudante(String nome, String CPF, int idade, String[] disciplinas, String RGA) {
        super(nome, CPF, idade, disciplinas);
        this.RGA = RGA;
    }

    public String getRGA() {
        return RGA;
    }

    public String getInfo() {
        return "Aluno de RGA " + RGA;
    }
}
