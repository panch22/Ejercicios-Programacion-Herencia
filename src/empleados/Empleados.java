package empleados;

public abstract class Empleados {
	protected int codigoEmpleado;
	protected String nombre;
	protected double sueldoFijo;
	protected Empresa empresa;
	
	public Empleados(int codigoEmpleado, String nombre, Empresa empresa) {
		this.codigoEmpleado = codigoEmpleado;
		this.nombre = nombre;
		this.empresa = empresa;
	}

	public Empleados() {
		this(0, null, null);
	}
	
	public abstract double calcularSueldoMensual();
	
	public String toString() {
		return "\nSus caracteristicas son:"
				+ "\n1. Código de empleado: "+this.codigoEmpleado
				+ "\n2. Nombre: "+this.nombre
				+ "\n3. Sueldo fijo: "+this.sueldoFijo
				+ "\n4. Sueldo Mensual: "+this.calcularSueldoMensual()
				+ "\n5. Denominación de la empresa donde trabaja: "+empresa.getDenominacion();
	}
}
