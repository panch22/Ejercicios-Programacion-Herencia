package flotaAutomovilistica;

public class Vehiculo {
	protected String matricula;
	protected int numeroRuedas;
	protected float precio;
	private String color;
	
	public Vehiculo(String matricula, int numeroRuedas, float precio, String color) {
		this.matricula = matricula;
		this.numeroRuedas = numeroRuedas;
		this.precio = precio;
		this.color = color;
	}

	public Vehiculo() {
		this(null,0,0f,null);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float establecer_precio() {
		double IVA = 0.21;
		float precioFinal = (float) (this.precio + (this.precio * IVA));
		return precioFinal;
	}
	
	public String toString() {
		return "Matricula: "+this.matricula+ "| Ruedas: "+this.numeroRuedas+"| Color: "+this.color+"| Precio: "+this.precio;
	}
}

