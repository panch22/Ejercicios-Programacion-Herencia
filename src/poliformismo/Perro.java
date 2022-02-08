package poliformismo;

public class Perro extends Mamifero {
	private String raza;

	public Perro(Especie especie, String raza) {
		super(especie);
		this.raza = raza;
	}

	public Perro() {
		this(null, null);
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	@Override
	public void moverse() {
		super.moverse();
		System.out.print(" caminando");
	}
	
	@Override
	public String toString() {
		return "\nSu raza es "+this.raza;
	}
	
	public void verCualidades() {
		System.out.println("Las cualidades de los perros son:"
				+"\n\t1. Dulces"
				+"\n\t2. Leales"
				+"\n\t3. Divertidos");
	}
	
}
