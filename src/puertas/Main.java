package puertas;

public class Main {
	public Main() {
		Puerta puerta1 = new Puerta (1, "Automatica", false);
		Puerta puerta2 = new Puerta (2, "Automatica", false);
		Puerta puerta3 = new Puerta (3, "Manual", false);
		Ventana ventana4 = new Ventana (4, "Automatica", false);
		
			puerta1.informacion();
			puerta2.informacion();
			puerta3.informacion();
			ventana4.informacion();
	}
	
	public static void main(String[] args) {
		Main interfaz = new Main();
	}

}
