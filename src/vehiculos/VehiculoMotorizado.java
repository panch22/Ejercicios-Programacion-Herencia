package vehiculos;

public class VehiculoMotorizado {
	protected String fabricante;
	protected String modelo;
	protected int añoFabricacion;
	protected int kilometraje;
	
	public VehiculoMotorizado(String fabricante, String modelo, int añoFabricacion, int kilometraje) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.kilometraje = kilometraje;
	}

	public VehiculoMotorizado() {
		this(null, null, 0, 0);
	}
	
	public String toString() {
		return "\n1. Fabricante: "+this.fabricante
				+ "\n2. Modelo: "+this.modelo
				+ "\n3. Año de fabricación: "+this.añoFabricacion
				+ "\n4. Kilometraje: "+this.kilometraje;
	}
}
