package interfaz2;

public class Raton extends Animal implements IPresa{

	public Raton() {
		this(null, null);
	}

	public Raton(String tipo, String comportamiento) {
		super(tipo, comportamiento);
	}
}
