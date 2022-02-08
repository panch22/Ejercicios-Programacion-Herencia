package enumerado;

import java.util.*;

public class Principal {
	public static Scanner sc = new Scanner (System.in);
	public Principal() {
	Coche car = new Coche("Audi", TipoSeguro.TERCEROS);
	System.out.println("Marca: "+car.getMarca()+" y tipo de seguro: "+car.getSeguro().name().toLowerCase());
	Coche car1 = new Coche();
	System.out.println("Meta la marca del coche");
	car1.setMarca(sc.next());
	System.out.println("Meta el tipo de seguro (terceros o todo riesgo)");
	String tipo = sc.next();
		if (tipo.equalsIgnoreCase("Terceros")) {
			car1.setSeguro(TipoSeguro.TERCEROS);
		} else
			car1.setSeguro(TipoSeguro.TODO_RIESGO);
		System.out.println("Marca: "+car1.getMarca()+" y tipo de seguro:  "+car1.getSeguro().name().toLowerCase());
	}
	public static void main (String[] args) {
		Principal interfaz = new Principal();
	}
}
