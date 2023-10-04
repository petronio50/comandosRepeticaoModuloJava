package operadoresbasicos;

public class SituacaoAcademica {
	
	// CLASSE SITUAÇÃO ACADEMICA
	
	// Atributos
	
	double nota1;
	double nota2;
	int quantidadeFaltas;
	// Criando o construtor 	
	
	public SituacaoAcademica(double nota1, double nota2, int quantidadeFaltas) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.quantidadeFaltas = quantidadeFaltas;
	}
	// Metodo
		
		double CalcularMedia () {
			return (nota1 + nota2)/2;
	}
	// No retorno do Metodo foi criada uma variavel auxiliar para melhor 
	//	manipulaçao dos dados 
	
	String inferirStatus (){
		double media = CalcularMedia();
		if (quantidadeFaltas > 15) {
			return "Reprovado por faltas";
		} else if (media < 5) {
			return "Reprovado por média";
		} else if (media >=7) {
			return "Esta aprovado";
		}else {
			return "Esta na final";
		}
		
	}
	
}		
