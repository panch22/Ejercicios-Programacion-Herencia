package abstracto;

public class Visualizar {
	public void visualizar (Instrumento instrument) {
		System.out.print(instrument.toString()+". ");
		instrument.tocarInstrumento();
	}
}

