import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        // Criação do vetor com o tamanho e leitura
        // do valor de n
        int[] vetor = new int[100];
        Scanner ipt = new Scanner(System.in);
        int n = ipt.nextInt();

        // Alocando os multiplicadores no vetor
        int multi = n;
        for(int i = 0; i < 100; i++) {

            multi += n;
            vetor[i] = multi;
        }

        // Realizando a soma dos multiplos
        int soma = 0;
        for(int i = 0; i < vetor.length; i++) {

            soma += vetor[i];
        }

        // Imprimindo o valor da soma
        System.out.println(soma);
    }
}