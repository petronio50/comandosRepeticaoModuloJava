package operadoresbasicos;

public class Retangulo {
	// Classe criada sobre o conceito de Retangulo
	// Atributos
	double base;
	double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
		//Metodos
	double CalcularAera () {
		return base * altura; 
	}
	
	double CalculararPerimetro ( ) {
		return 2 * (base + altura);
	}
	
}
