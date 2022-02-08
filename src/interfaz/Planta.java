package interfaz;

public class Planta implements ISerVivo {
	private String denominacion;
	
	public Planta(String denominacion) {
		super();
		this.denominacion = denominacion;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	@Override
	public void comer() {
		System.out.println("La planta "+this.denominacion+" hace la fotosíntesis");
	}
	
	
}
