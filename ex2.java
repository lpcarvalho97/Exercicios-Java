package sa4Programacao;
import java.util.Scanner;

public class ex2 {
	
	public static void main(String[]Args) {
		
		int total = 0;
		int totalAdversario = 0;
		int pontos = 0;
		
		for(int partida=1; partida <= 5; partida++) {
			
			Scanner entrada = new Scanner(System.in);
			int numero;
			System.out.println("Informe o n�mero de gols do nosso time na partida " + partida + ":");
			numero = entrada.nextInt();
			
			Scanner entrada2 = new Scanner(System.in);
			int numero2;
			System.out.println("Informe o n�mero de gols do time advers�rio " + partida + ":");
			numero2 = entrada2.nextInt();
			
			if (numero > numero2) {
				pontos = pontos + 3;
			}
			
			if (numero == numero2) {
				
				pontos = pontos + 1;
			}
			
			total = total + numero;
			totalAdversario = totalAdversario + numero2;
			
			if (partida >= 5) {
				System.out.println("A pontua��o total do nosso time no campeonato � " + pontos + " pontos");
				System.out.println("Nosso time marcou " + total + " gols");
				System.out.println("Nosso time sofreu " + totalAdversario + " gols");
				entrada.close();
				entrada2.close();
				
				if (pontos >= 10) {
					System.out.println("Nosso time est� classificado para o mata-mata!");
				}
				
				if (pontos < 10) {
					System.out.println("Nosso time est� desclassificado!");
				}
			}
			}	
		}
	}


