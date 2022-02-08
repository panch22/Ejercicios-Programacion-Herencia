package abstracto;

public class Violin extends Instrumento {
	
	public Violin (String tipo) {
		super(tipo);
	}

	@Override
	public void tocarInstrumento() {
		System.out.println("Se toca con el arco");
	}
}
