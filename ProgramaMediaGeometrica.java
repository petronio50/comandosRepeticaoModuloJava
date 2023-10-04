package operadoresbasicos;

import java.util.Scanner;
public class ProgramaMediaGeometrica {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Digite o primeiro valor: ");
	int a = ENTRADA.nextInt();
	System.out.println("Digite o segundo valor: ");
	int b = ENTRADA.nextInt();
	double mediaGeometrica = Math.sqrt(a * b); 
	System.out.println("A média é: " + mediaGeometrica);
	}

}
