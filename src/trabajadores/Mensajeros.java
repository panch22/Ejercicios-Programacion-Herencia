package trabajadores;

public class Mensajeros extends Empleados{
	private int edad;
	private final double dietas = 48.0;
	
	public Mensajeros(int codigoEmpleado, String nombre, int edad) {
		super(codigoEmpleado, nombre);
		this.edad = edad;
	}

	public Mensajeros() {
		this(0, null, 0);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDietas() {
		return dietas;
	}

	@Override
	public String toString() {
		return super.toString()+"\nEdad: "+this.edad
				+"\nSueldo total (al mes): ";
	}
	
}
