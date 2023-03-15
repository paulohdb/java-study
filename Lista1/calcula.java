import java.util.Scanner;

public class calcula {

    public static void main(String[] args){

        Scanner ipt = new Scanner(System.in);

        boolean getOut = true;

        do {

            double firstValue = ipt.nextDouble();

            char operator = ipt.next().charAt(0);
            
            double secValue = ipt.nextDouble();

            if (firstValue == 0 && operator == 'x' && secValue == 0) {

                getOut = false;

                break;
            }

            else {
                switch (operator) {

                    case '+':
                        System.out.println(firstValue + secValue);
                    break;
                    
                    case '-':
                        System.out.println(firstValue - secValue);
                    break;

                    case '/':
                        System.out.println(firstValue / secValue);
                    break;

                    case '*':
                        System.out.println(firstValue * secValue);
                    break;
                }

            }
            
           
        } while(getOut);

    }
}