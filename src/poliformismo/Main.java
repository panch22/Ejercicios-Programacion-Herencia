package poliformismo;

public class Main {
	public Main() {
		Mamifero cachorro = new Perro (Especie.PERRO, "Labrador");
		//Se puede Perro cachorro porque Perro extiende a Mamifero.
		Mamifero pececito = new Delfin (Especie.DELFIN, 2.3);
		Caracteristicas facetas = new Caracteristicas();
		facetas.imprimir(pececito);
		facetas.imprimir(cachorro);
		
	}
	public static void main(String[] args) {
		Main interfaz = new Main();
	}

}
