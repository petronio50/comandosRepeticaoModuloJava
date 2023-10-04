package operadoresbasicos;

import java.util.Scanner;
public class ProgramaNotasFaltas {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
	
		// ENTRADA DE DADOS
	System.out.println("Digite a primeira nota");
	double nota1 = ENTRADA.nextDouble();
	System.out.println("Digite a segunda nota");
	double nota2 = ENTRADA.nextDouble();
	System.out.println("Digite a quantidade de faktas");
	int quatFaltas = ENTRADA.nextInt();
	
		//PROCESSAMENTO
		// CRIA UM OBJETO SITUAÇÃO ACADEMICA
	SituacaoAcademica situacao = new SituacaoAcademica(nota1, nota2, quatFaltas);
	double media = situacao.CalcularMedia();
	String status = situacao.inferirStatus();
	
	System.out.println(media);
	System.out.println(status);
	}
}
