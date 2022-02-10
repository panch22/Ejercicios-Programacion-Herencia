package interfaz2;

public interface ICazador {
	default void perseguir (Animal animal, Animal animal2) {
		System.out.println("El "+animal.tipo+ " persigue a "+animal2.tipo);
	}
}
