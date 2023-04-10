import java.util.Scanner;

public class ex3 {

    static int vef(int v) {
        return (v % 2 == 1)? v/2 + 1 : v/2;
    }
    public static void main(String[] args) {
        
        Scanner ipt = new Scanner(System.in);
        int n = ipt.nextInt();
        int[] vetor = new int[n];

        for(int i = 0; i < vetor.length; i++) 
            vetor[i] = ipt.nextInt();
        
        for (int i = 0; i < vef(n); i++) {

            int soma = vetor[i] + vetor[n-1-i];
            System.out.println(soma);
        }


    }
}
