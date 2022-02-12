package vehiculos;

public class Camion extends VehiculoMotorizado implements CapacidadLimite {
	private int nRemolques;
	private int nPasajeros;

	public Camion() {
		this(null, null, 0, 0, 0, 0);
	}

	public Camion(String fabricante, String modelo, int añoFabricacion, int kilometraje, int nRemolques, int nPasajeros) {
		super(fabricante, modelo, añoFabricacion, kilometraje);
		this.nRemolques = nRemolques;
		this.nPasajeros = nPasajeros;
	}

	public int getnRemolques() {
		return nRemolques;
	}

	public void setnRemolques(int nRemolques) {
		this.nRemolques = nRemolques;
	}

	@Override
	public String medidasSeguridad() {
		String medida;
		if (this.nPasajeros > nAutorizadosCamion) {
			medida = "No se cumplen las medidas de seguridad";
		} else 
			medida = "Se cumplen las medidas de seguridad";
		return medida;
	}
	
	public String toString() {
		return super.toString() + "\n5. N� remolques: "+this.nRemolques+ "\n6. Medidas de seguridad: "+medidasSeguridad();
	}
}
	
	
	
	

