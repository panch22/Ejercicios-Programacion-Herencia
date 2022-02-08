package trabajadores;

public class Empleados {
	protected int codigoEmpleado;
	protected String nombre;
	protected double sueldoBase = 1000.0;

	public Empleados(int codigoEmpleado, String nombre) {
		this.codigoEmpleado = codigoEmpleado;
		this.nombre = nombre;
	}

	public Empleados() {
		this(0, null);
	}

	public String toString() {
		return "\nCódigo de Empleado: #" + this.codigoEmpleado + "\nNombre: " + this.nombre;
	}

}
