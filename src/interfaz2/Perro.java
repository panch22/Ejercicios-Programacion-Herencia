package interfaz2;

public class Perro extends Animal implements ICazador{
	
	public Perro() {
		this(null, null);
	}

	public Perro(String tipo, String comportamiento) {
		super(tipo, comportamiento);
	}
}
