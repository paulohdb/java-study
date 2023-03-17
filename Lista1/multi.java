import java.util.Scanner;

public class multi {
    public static void main(String[] args) {

        Scanner ipt = new Scanner(System.in);
        
        int x = ipt.nextInt();
        
        int guarda = 0;
        
        for (int i=1; i < 1001; i++) {
            
            if (i % x == 0) {
                    
                guarda += i;
                
            }
        }
        
        System.out.println(guarda);
        
    }
}