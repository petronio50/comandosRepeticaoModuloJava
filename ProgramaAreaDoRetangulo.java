package operadoresbasicos;

import java.util.Scanner;
public class ProgramaAreaDoRetangulo {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite a base: ");
		double base = ENTRADA.nextDouble();
		System.out.println("Digite a altura");
		double altura = ENTRADA.nextDouble();
		
		double area = base * altura; 
		double perimetro = 2 * (base * altura);
		System.out.println("A area do retângulo é: " + area);
		System.out.println("O perimetro do retângulo é: " + perimetro);
		
		
	}

}
