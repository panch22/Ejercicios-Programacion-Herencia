package poliformismo;

public class Mamifero {
	protected Especie especie;

	public Mamifero(Especie especie) {
		this.especie = especie;
	}

	public Mamifero() {
		this(null);
	}
	
	public void moverse() {
		System.out.print("\nEl "+this.especie.toString().toLowerCase()+" se mueve");
	}
}
