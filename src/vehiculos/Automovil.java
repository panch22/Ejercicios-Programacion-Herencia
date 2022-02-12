package vehiculos;

public class Automovil extends VehiculoMotorizado implements CapacidadLimite {
	private String estilo;
	private int nPasajeros;
	
	public Automovil() {
		this(null, null, 0, 0, null, 0);
	}

	public Automovil(String fabricante, String modelo, int añoFabricacion, int kilometraje, String estilo, int nPasajeros) {
		super(fabricante, modelo, añoFabricacion, kilometraje);
		this.estilo = estilo;
		this.nPasajeros = nPasajeros;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String medidasSeguridad() {
		Boolean cumple = false;
		if (this.estilo.equalsIgnoreCase("VAN")) {
				cumple = this.nPasajeros<=nAutorizadosVan;
		} else {
				cumple = this.nPasajeros<=nAutorizadosCoche;
		}
		
		if (cumple) 
			return "Se cumplen las medidas de seguridad";
		else
			return "No se cumplen las medidas de seguridad";
	}
	
	public String toString() {
		return super.toString() + "\n5. Estilo: "+this.estilo+"\n6. Medidas de seguridad: "+medidasSeguridad();
	}
	
	/*@Override
	public String medidasSeguridad() {
		String medida;
		switch(estilo) {
		case "VAN": 
			if (this.nPasajeros>nAutorizadosVan) {
				medida = "No se cumplen las medidas de seguridad";
			} else
				medida = "Se cumplen las medidas de seguridad";
			break;
		default:
			if (this.nPasajeros>nAutorizadosCoche) {
				medida = "No se cumplen las medidas de seguridad";
			} else
				medida = "Se cumplen las medidas de seguridad";
			break;
		}
		return medida;
	}*/
}
