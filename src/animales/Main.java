package animales;

import java.util.*;

public class Main {
	public Scanner sc = new Scanner (System.in);
	
	public Main() {
		Perro cachorro = new Perro ();
		Serpiente huevo = new Serpiente();
	
		System.out.println("Meta la raza del perro");
		cachorro.setRaza(sc.next());
		System.out.println("Meta el peso del perro");
		cachorro.peso = sc.nextFloat();
		cachorro.tipoAnimal = "perro";
		System.out.println("Meta el peso de la serpiente");
		huevo.peso = sc.nextFloat();
		huevo.tipoAnimal = "serpiente";
		System.out.println("Meta si es venenosa o no");
		String veneno = sc.next();
			if(veneno.equalsIgnoreCase("si")) { //Este "contentEquals" ignora tanto si 
												//está escrita en mayúscula como no
				huevo.setEsVenenosa(true);
			} else
				huevo.setEsVenenosa(false);
		
		System.out.println("\n"+cachorro.toString());
		cachorro.emitirSonido();
		System.out.println(huevo.toString()+huevo.confirmarVeneno());
		huevo.emitirSonido();
	}

	public static void main(String[] args) {
		Main interfaz = new Main();
	}

}
