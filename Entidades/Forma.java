package Entidades;

public abstract class Forma {
	
	
	
	abstract double area();
	
	@Override
	public String toString() {
		
		return "" + area();
	}
}
