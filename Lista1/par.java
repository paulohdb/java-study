import java.util.Scanner;

public class par {
    public static void main(String[] args){

        Scanner ipt = new Scanner(System.in);

        int x = ipt.nextInt();

        if (x % 2 == 0) {

            System.out.println("Par");
        }
        
        else {
            System.out.println("Impar");
        }
    }
}