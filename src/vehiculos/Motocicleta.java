package vehiculos;

public class Motocicleta extends VehiculoMotorizado {
	private String usoDeterminado;

	public Motocicleta(String fabricante, String modelo, int añoFabricacion, int kilometraje, String usoDeterminado) {
		super(fabricante, modelo, añoFabricacion, kilometraje);
		this.usoDeterminado = usoDeterminado;
	}

	public Motocicleta() {
		this(null, null, 0, 0, null);
	}

	public String getUsoDeterminado() {
		return usoDeterminado;
	}

	public void setUsoDeterminado(String usoDeterminado) {
		this.usoDeterminado = usoDeterminado;
	}
	
	public String toString() {
		return super.toString() + "\n5. Uso: "+this.usoDeterminado;
	}
	
}
