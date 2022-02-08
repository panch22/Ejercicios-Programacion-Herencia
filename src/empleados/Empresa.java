package empleados;

public class Empresa {
	private String denominacion;
	//private int CIF;
	private int totalEmpleados;
	private double totalPagado;
	
	public Empresa(String denominacion) {
		this.denominacion = denominacion;
	}

	public Empresa() {
		this(null);
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public int getTotalEmpleados() {
		return totalEmpleados;
	}

	public void setTotalEmpleados(int totalEmpleados) {
		this.totalEmpleados = totalEmpleados;
	}

	public double getTotalPagado() {
		return totalPagado;
	}

	public void setTotalPagado(double totalPagado) {
		this.totalPagado = totalPagado;
	}
	
	
}
