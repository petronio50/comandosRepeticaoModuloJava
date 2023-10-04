package operadoresbasicos;

import java.util.Scanner;

public class ProgramaNumerosPrimos {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o primeiro número: ");
		int n1 = ENTRADA.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = ENTRADA.nextInt();
		int soma = n1 + n2;
		// testar se a soma é igual a um dos números primos entre 
		// 0 e 5, que são: 1,2,3 e 5.
		if (soma == 1) {
			System.out.println("Soma é o número primo 1");
		} else if (soma == 2) {
			System.out.println("Soma é o número primo 2");
		} else if (soma == 3) {
			System.out.println("Soma é o número primo 3");
		} else if (soma == 5) {
			System.out.println("soma é o número primo 5");
		} else {
			System.out.println("soma não é um número primo");
		}
	}

}
