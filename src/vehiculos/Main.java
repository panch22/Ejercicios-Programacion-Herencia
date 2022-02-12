package vehiculos;

public class Main {
	public Main() {
		Automovil coche = new Automovil("Toyota", "Aygo", 2007, 90000, "Turismo", 1);
		Motocicleta moto = new Motocicleta ("Honda", "Super", 2018, 50000, "Deportivo");
		Camion camion = new Camion ("Citröen", "Cactus", 2015, 40000, 2, 3);
		
		System.out.println(coche.toString());
		System.out.println(moto.toString());
		System.out.println(camion.toString());	
	}
	
	public static void main(String[] args) {
		Main interfaz = new Main();
	}

}
