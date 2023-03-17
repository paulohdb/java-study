import java.util.Scanner;
import java.lang.Math;

public class bobSquare {
    public static void main(String[] args) {

        Scanner ipt = new Scanner(System.in);
        
        int n = ipt.nextInt();

        for (int i=0; i < n; i++) {

            int x = ipt.nextInt();
            
            double quad = Math.sqrt(x);

            if (x * x == quad) {

                System.out.println(x);
            }
        }
    }
}