package abstracto;

public class Main {
		Instrumento guitar = new Guitarra ("la guitarra");
		Instrumento violin = new Violin ("el violin");
		Visualizar musica = new Visualizar();
		public Main() {
			musica.visualizar(guitar);
			musica.visualizar(violin);
		}
	public static void main(String[] args) {
		Main interfaz = new Main();
	}

}
