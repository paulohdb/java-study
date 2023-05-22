public class Professor extends Pessoa{
    String cadastro;

    Professor(String nome, String CPF, int idade, String[] disciplinas, String cadastro) {
        super(nome, CPF, idade, disciplinas);
        this.cadastro = cadastro;
    }

    public String getCadastro() {
        return cadastro;
    }

    public String getInfo() {
        return "Professor de cadastro " + cadastro;
    }
}
