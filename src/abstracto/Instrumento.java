package abstracto;

public abstract class Instrumento {
	private String tipo;

	public Instrumento(String tipo) {
		this.tipo = tipo;
	}

	public Instrumento() {
		this(null);
	}

	@Override
	public String toString() {
		return "El instrumento es "+this.tipo;
	}
	
	public abstract void tocarInstrumento(); 
	
}
