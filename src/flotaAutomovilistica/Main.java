package flotaAutomovilistica;

public class Main {
	Moto Scooter;
	Moto Honda;
	Camion Opel;
	
	public Main() {
		Scooter = new Moto("5342FFF", 3, 3000f, "Rojo", false);
		Honda = new Moto("1980AFC", 5000f, "Azul", true);
		Opel = new Camion("2566QWN", 8, 20000f, "Verde", 15000f, TipoMotor.DIESEL);
		
		System.out.println("Datos de la moto Scooter");
		System.out.println(Scooter.toString());
		System.out.println("\nDatos de la moto Honda");
		System.out.println(Honda.toString());
		System.out.println("\nDatos del camión");
		System.out.println(Opel.toString());
	}

	public static void main(String[] args) {
		Main interfaz = new Main();
	}

}
