package operadoresbasicos;
		//Escrever um programa java que dados dois números reais, calcule a média 
		// aritimetica entre eles e a imprima no console.
import java.util.Scanner;
public class ProgramaMediaAritimetica {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o primeiro número");	
		double a = ENTRADA.nextDouble();
		System.out.println("Digite o segundo número");
		double b = ENTRADA.nextDouble();
		double media = (a + b) / 2;
		System.out.println("A média é: " + media);
	}

}
