package interfaz;

public class Main {
	public Main() {
		ISerVivo dog1 = new Perro("Chiwuawua");
		ISerVivo plant1 = new Planta("Carbayon");
		Cualidades quality = new Cualidades();
		
		quality.conocerAlimento(dog1);
		quality.conocerAlimento(plant1);
		
	}
	public static void main (String[] args) {
		Main interfaz = new Main();
	}
}
