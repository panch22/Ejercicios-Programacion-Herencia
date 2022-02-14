package figuras;

public class Main {
	public Main() {
		Figura circle = new Circulo(2.2, 3.0, 1);
		Figura rectangle = new Rectángulo(4.0, 6.0, 10.0, 16.0);
		Resultados informacion = new Resultados();
			while (true) 
			informacion.tratarCaracter(circle, rectangle);
			
	}
	
	public static void main(String[] args) {
		Main interfaz = new Main();
	}

}
