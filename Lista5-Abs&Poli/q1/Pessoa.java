abstract public class Pessoa {
    String nome;
    String CPF;
    int idade;
    String[] disciplinas;

    Pessoa(String nome, String CPF, int idade, String[] disciplinas) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.disciplinas = new String[7];
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void incrementaIdade() {
        idade++;
    }

    public String getInfo() {
        return "Pessoa de nome " + nome;
    }
}
