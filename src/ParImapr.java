import java.util.Random;
import java.util.Scanner;

public class ParImapr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int digitado = -1, imparPar, sorteio;
		boolean opcao = false; // continuar jogando

		do {
			System.out.println("Escolha 0 - (par) ou 1 - (ímpar)");
			digitado = scanner.nextInt();

			sorteio = random.nextInt(11);
			imparPar = sorteio % 2;

			if (digitado == 0) {
				System.out.println("Você escolheu: par");
				System.out.println("A máquina escolheu: impar");
				System.out.println("O numero sorteado foi: " + sorteio + "\n");
				if (imparPar == 0) {
					System.out.println("Você Venceu!");
				} else {
					System.out.println("Você Perdeu!");
				}
			} else if (digitado == 1) {
				System.out.println("Você escolheu: impar");
				System.out.println("A máquina escolheu: par");
				System.out.println("O numero sorteado foi: " + sorteio + "\n");
				if (imparPar == 1) {
					System.out.println("Você Venceu!");
				} else {
					System.out.println("Você Perdeu!");
				}
			} else {
				System.out.println("Digite um opcão válida");
				opcao = true;
			}
			System.out.println("Deseja jogar novamente? \n0 - Sim ou 1 - Não");
			digitado = scanner.nextInt();
			if (digitado == 0) {
				opcao = true;
			}

		} while (opcao);

		scanner.close();
	}
}
