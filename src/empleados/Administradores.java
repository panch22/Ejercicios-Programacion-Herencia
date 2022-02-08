package empleados;

public class Administradores extends Empleados {
	private double horasExtras;
	private final double precioHExtras = 30.0;

	public Administradores(int codigoEmpleado, String nombre, Empresa empresa, double horasExtras) {
		super(codigoEmpleado, nombre, empresa);
		this.horasExtras = horasExtras;
		this.sueldoFijo = 1300.0;
	}
	
	public Administradores() {
		this(0, null, null, 0);
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public double calcularSueldoMensual() {
		return this.sueldoFijo+this.horasExtras*this.precioHExtras;
	}

	@Override
	public String toString() {
		return super.toString()+ "\n6. Horas extras: "+this.horasExtras;
	}
}
