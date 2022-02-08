package interfaz;

public class Cualidades {
	public void conocerAlimento(ISerVivo serVivo) {
		serVivo.comer();
		if (serVivo instanceof Perro) {
			((IAnimal) serVivo).vacunar();
		}
	}
}
