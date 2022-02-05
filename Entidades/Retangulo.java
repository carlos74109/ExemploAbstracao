package Entidades;

public class Retangulo extends Forma {
	
	private Double largura;
	private Double altura;
	
	

	public Retangulo(Double largura, Double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}



	@Override
	double area() {
		
		return largura * altura;
	}
	
	
	
	
}
