package operadoresbasicos;

import java.util.Scanner;
public class ProjetoLoginUsuarioSenha {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o usuário:");
		long usuario = ENTRADA.nextLong();
		System.out.println("Digite a senha:");
		long senha = ENTRADA.nextLong();
		// testando se o usuário e valido
		
		if (usuario == 123456) {
		System.out.println("O usuario é valido");
		} else {
		System.out.println("O usuario é inválido");
		}
		// testando se a senha é valida
		if (senha == 19711112) {
		System.out.println("A senha é valida");
		} else {
		System.out.println("A senha é inválida");
		}
		System.out.println("FIM CONCLUÍDO");
	}

		

}
