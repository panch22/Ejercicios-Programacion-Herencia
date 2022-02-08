package trabajadores;

public class Main {
	Empleados mensajero;
	Empleados mozo;
	Sueldo sueldo = new Sueldo();
	public Main() {
		mensajero = new Mensajeros(1, "Luis", 25);
		mozo = new MozosAlmacen(2, "Pedro", 6);
		System.out.println(sueldo.toString(mensajero));
		System.out.println(sueldo.toString(mozo));
		System.out.println("\nEl total pagado por la empresa (al mes): "
				+ (Sueldo.calcularSueldo(mozo) + Sueldo.calcularSueldo(mensajero)));	
	}

	public static void main(String[] args) {
		Main interfaz = new Main();
	}

}
