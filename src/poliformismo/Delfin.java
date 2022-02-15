package poliformismo;

public class Delfin extends Mamifero {
	private double tama�o;

	public Delfin(Especie especie, double tama�o) {
		super(especie);
		this.tama�o = tama�o;
	}

	public Delfin() {
		this(null, 0.0);
	}

	public double gettama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	
	@Override 
	public void moverse() {
		super.moverse();
		System.out.print(" nadando");
	}
	
	@Override
	public String toString() {
		return "\nSu tamaño es de "+this.tama�o+" metros";
	}
	
	public void verCualidades() {
		System.out.println("Las cualidades de los delfines son:"
				+ "\n\t1. Inteligentes"
				+ "\n\t2. Emp�ticos"
				+ "\n\t3. Graciosos");
	}
	
}
