package poliformismo;

public class Caracteristicas {
	public void imprimir(Mamifero animal) {
		animal.moverse();
		System.out.println(animal.toString());
		if(animal instanceof Perro) {
			System.out.println("\nCualidades del Perro");
			((Perro) animal).verCualidades();
		} else
			System.out.println("\nCualidades del Delfín");
			((Delfin) animal).verCualidades();
	}
}
