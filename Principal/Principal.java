package Principal;

import Entidades.Circulo;
import Entidades.Forma;
import Entidades.Retangulo;

public class Principal {

	public static void main(String[] args) {
		
		Forma form = new Circulo(4.14);
		Forma formRet = new Retangulo(4.0, 3.0);
		System.out.println(form);
		System.out.println(formRet);
		
	}

}
