package operadoresbasicos;

import java.util.Scanner;

public class ProgramaRetangulo {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo (2.0,4.0);
		
		double area = r1.CalcularAera();
		double perimetro = r1.CalculararPerimetro();
		
		System.out.println("A área é: " + area);
		System.out.println("O perimetro é:" + perimetro);
		

	}

}
