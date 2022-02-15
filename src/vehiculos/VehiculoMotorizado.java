package vehiculos;

public class VehiculoMotorizado {
	protected String fabricante;
	protected String modelo;
	protected int a�oFabricacion;
	protected int kilometraje;
	
	public VehiculoMotorizado(String fabricante, String modelo, int a�oFabricacion, int kilometraje) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.a�oFabricacion = a�oFabricacion;
		this.kilometraje = kilometraje;
	}

	public VehiculoMotorizado() {
		this(null, null, 0, 0);
	}
	
	public String toString() {
		return "\n1. Fabricante: "+this.fabricante
				+ "\n2. Modelo: "+this.modelo
				+ "\n3. A�o de fabricaci�n: "+this.a�oFabricacion
				+ "\n4. Kilometraje: "+this.kilometraje;
	}
}
