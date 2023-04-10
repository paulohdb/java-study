import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {

        // Criação do leitor e leitura de n
        Scanner ipt = new Scanner(System.in);
        int n = ipt.nextInt();

        // Criação do vetor de n posições
        double[] vetor = new double[n];

        // Preenchimento dos valores reais
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = ipt.nextDouble();
        }

        double maior = vetor[0];
        // Verificação do maior número
        for(int i = 1; i < vetor.length; i++) {

            if (vetor[i] > maior) 
                maior = vetor[i];
        }   

        // Impressão do maior número
        System.out.println(maior);
    }
}
