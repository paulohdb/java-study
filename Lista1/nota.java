import java.util.Scanner;

public class nota {
	public static void main(String[] args){
		Scanner ipt = new Scanner(System.in);
		
		double x = ipt.nextDouble();

		double y = ipt.nextDouble();

		if ((x + y)/2 >= 6.0) {

			System.out.println("Aprovado");
		}

		else {
			System.out.println("Reprovado");
		}
	}

}
