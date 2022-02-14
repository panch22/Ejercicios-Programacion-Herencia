package figuras;

import java.util.*;

public class Resultados {
	public static Scanner sc = new Scanner(System.in);
	public String devolverCaracter() {
		System.out.println("\nIntroducir 'c' o 'r'");
		String letra = sc.next();
		
		while (!letra.contentEquals("c") && !letra.contentEquals("r")) {
			System.out.println("Error. Introducir 'c' o 'r'");
			letra = sc.next();
		} 
		
		return letra;
	}
	
	public void tratarCaracter(Figura figura1, Figura figura2) {
		switch(devolverCaracter()) {
		case "c":
			imprimir((Circulo) figura1);
			break;
		case "r":
			imprimir((Rectángulo) figura2);
			break;
		}
	}
	
	public void imprimir(Figura figura) {
		System.out.println(figura.toString());
		System.out.println("Su perimetro es: "+figura.calcularPerimetro());
	}
}
