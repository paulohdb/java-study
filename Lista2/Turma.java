class Turma {
    Aluno [] listaAlunos;
    String disciplina;
    int anoVigente;

    Turma(int nAlunos, int anoVigente, String disciplina, 
    String[] nomes, String[] rgas, double[] medias) {

        this.disciplina = disciplina;
        this.anoVigente = anoVigente;

        listaAlunos = new Aluno[nAlunos];
        
        for(int i = 0; i < nAlunos; i++) {
            
            double mediaAluno = medias[i];
            String nomeAluno = nomes[i];
            String rgaAluno = rgas[i];

            double [] mediaVetor = {mediaAluno};
            String [] disciplinaVetor = {disciplina};

            listaAlunos[i] = new Aluno(nomeAluno, rgaAluno, anoVigente, 
            disciplinaVetor, mediaVetor);
        }
    }

    void melhorMedia() {
        double mediaBest = 0.0;
        int indice = -1;

        for (int i = 0 ; i < listaAlunos.length ; i++) {
            if (mediaBest <= listaAlunos[i].devolveCoeficienteRendimento()) {
                mediaBest = listaAlunos[i].devolveCoeficienteRendimento();
                indice = i;
            }
            listaAlunos[indice].imprimeNome();
        }
        
    }
}

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
