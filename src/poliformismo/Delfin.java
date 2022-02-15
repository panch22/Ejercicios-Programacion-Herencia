package poliformismo;

public class Delfin extends Mamifero {
	private double tamaño;

	public Delfin(Especie especie, double tamaño) {
		super(especie);
		this.tamaño = tamaño;
	}

	public Delfin() {
		this(null, 0.0);
	}

	public double gettamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	
	@Override 
	public void moverse() {
		super.moverse();
		System.out.print(" nadando");
	}
	
	@Override
	public String toString() {
		return "\nSu tamaÃ±o es de "+this.tamaño+" metros";
	}
	
	public void verCualidades() {
		System.out.println("Las cualidades de los delfines son:"
				+ "\n\t1. Inteligentes"
				+ "\n\t2. Empï¿½ticos"
				+ "\n\t3. Graciosos");
	}
	
}
