package interfaz2;

public abstract class Gato extends Animal implements ICazador, IPresa{
	
	public Gato() {
		this(null, null);
	}

	public Gato(String tipo, String comportamiento) {
		super(tipo, comportamiento);
	}
}
