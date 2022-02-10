package interfaz2;

public interface IPresa {
	default void huir (Animal animal, Animal animal2) {
		System.out.println("El "+animal.tipo+ " huye de "+animal2.tipo);
	}
	
}
