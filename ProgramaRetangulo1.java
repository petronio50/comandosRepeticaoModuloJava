package operadoresbasicos;

import java.util.Scanner;

public class ProgramaRetangulo1 {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
	
		//ENTRADA
	
		System.out.println("Digite a base");
	double base = ENTRADA.nextDouble();
	System.out.println("Digite a altura");
	double altura = ENTRADA.nextDouble();
	Retangulo r1 = new Retangulo(base,altura);
	
		// PROCESSAMENTO
	
	double area = r1.CalcularAera();
	double perimetro = r1.CalculararPerimetro();
	
		//SAÍDA
	
	System.out.println("A área é: " + area);
	System.out.println("O perimetro é:" + perimetro);
	
	
	}

}
