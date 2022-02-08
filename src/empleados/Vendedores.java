package empleados;

public class Vendedores extends Empleados {
	private double ventas;
	private final double comisionVentas = 0.1;
	
	public Vendedores(int codigoEmpleado, String nombre, Empresa empresa, double ventas) {
		super(codigoEmpleado, nombre, empresa);
		this.ventas = ventas;
		this.sueldoFijo = 1200.0;
	}
	
	public Vendedores() {
		this(0, null, null, 0);
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	@Override
	public double calcularSueldoMensual() {
		return this.sueldoFijo+this.ventas*this.comisionVentas;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n6. Ventas conseguidas: "+this.ventas;
	}

}
