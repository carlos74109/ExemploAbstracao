package Entidades;

public class Circulo extends Forma {
	
	private Double raio;

	
	
	public Circulo(Double raio) {
		
		this.raio = raio;
	}




	@Override
	double area() {
		
		return raio * 3.14;
	}
	
	

}
