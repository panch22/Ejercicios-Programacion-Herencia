package puertas2;
//Hay algunas cosas mal escritas
public class Main {
	public Main() {
		final int ELEMENTOS = 6, ALEATORIO = 4;
		Itemporizador p1 = new PuertoAutomatica(1);
		PuertoManual p2 = new PuertoManual(2);
		Itemporizador p3 = new PuertoAutomatica(3);
		Itemporizador v1 = new VentanaAutomatica(1);
		System.out.println("Estado inicial de puertas y ventanas");
		System.out.println(p1.toString() + ((Puerta) p1).visualizarEstado());
		System.out.println(p2.toString() + p2.visualizarEstado());
		System.out.println(p3.toString() + ((Puerta) p1).visualizarEstado());
		System.out.println(v1.toString() + ((Ventana) p1).visualizarEstado());
		Automatica obj = new Automatica();
		System.out.println("Procedemos a bloquear o desbloquear las puertas o ventanas");

		for (int cont = 1; cont <= ELEMENTOS; cont++) {
			int num = (int) (Math.random() * ALEATORIO + 1);
			switch (num) {
			case 1:
				obj.visualizar(p1);
				break;
			case 2:
				if (p2.isBloqueada()) {
					p2.desbloquear();
				} else
					p2.bloquear();
			case 3:
				obj.visualizar(p3);
				break;
			case 4:
				obj.visualizar(v1);
				break;
			}
		}
		
		System.out.println("Estado final de puertas y ventanas");
		System.out.println(p1.toString() + ((Puerta) p1).visualizarEstado());
		System.out.println(p2.toString() + p2.visualizarEstado());
		System.out.println(p3.toString() + ((Puerta) p1).visualizarEstado());
		System.out.println(v1.toString() + ((Ventana) v1).visualizarEstado());
	}

	public static void main(String[] args) {
		Main interfaz = new Main();
	}

}
