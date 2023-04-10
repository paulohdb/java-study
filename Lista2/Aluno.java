class Aluno {
    String nome;
    String RGA;
    int anoDeIngresso;

    String [] disciplina;
    double [] medias;

    Aluno(String novoNome, String newrga, int AnoIngresso) {

        nome = novoNome;
        RGA = newrga;
        anoDeIngresso = AnoIngresso;
    }

    Aluno(String novoNome, String newrga, int AnoIngresso, String[] 
    listaDisciplinas, double[] listaMedias) {

        nome = novoNome;
        RGA = newrga;
        anoDeIngresso = AnoIngresso;
        disciplina = listaDisciplinas;
        medias = listaMedias;
    }

    int tempoDeCurso(int ano) {
        return ano - anoDeIngresso;
    }

    double devolveCoeficienteRendimento() {
        double rend = 0;
        for (int i = 0; i < medias.length; i++) {
            rend += medias[i]; 
        }
        return rend / medias.length;
    }

    void imprimeNome() {
        System.out.println(nome);
    }

    boolean comparaAluno(Aluno B) {

        return RGA == B.RGA;
    }
}
