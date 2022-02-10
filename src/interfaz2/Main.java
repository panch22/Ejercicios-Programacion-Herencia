package interfaz2;

public class Main {
	Perro dog = new Perro("Perro", "fiel");
	Raton mouse = new Raton("Ratón", "rápido");
	Gato cat = new Gato ("Gato", "lindo");
	
	public Main() {
		/*datos.imprimirDatosCazador(dog, cat);
		datos.imprimirDatosPresa(mouse, cat);
		datos.imprimirDatosCazador(cat, mouse);
		datos.imprimirDatosPresa(cat, dog);*/
		
		dog.visualizarCostumbresCazador(dog, cat); 
		cat.visualizarCostumbresCazador(cat, mouse); 
		cat.visualizarCostumbresPresa(cat, dog);
		mouse.visualizarCostumbresPresa(mouse, cat); 
	}
	public static void main(String[] args) {
		Main interfaz = new Main();
	}

}
