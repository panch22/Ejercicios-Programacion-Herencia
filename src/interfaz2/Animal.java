package interfaz2;

public class Animal {
	protected String tipo;
	protected String comportamiento;
	
	public Animal(String tipo, String comportamiento) {
		this.tipo = tipo;
		this.comportamiento = comportamiento;
	}

	public Animal() {
		this(null, null);
	}

	@Override
	public String toString() {
		return "El animal es de tipo "+this.tipo+", y su comportamiento es: "+this.comportamiento;
	}
	
}

