
package clasesdelproyecto;

import java.util.Scanner;

public class EntradaDatos {

	String def() {
	String def = "Los engranajes son elementos mecánicos clave que permiten la transmisión precisa \n"
			   + "y eficiente de movimiento y fuerza en la maquinaria. El diseño y configuración de \n"
			   + "todo engranaje tienen en común elementos tales como los dientes, los ejes, la transmisión... ";
	return def;
	
	}
	
	public String propuestaparacuriosos() {
	
		
		try (Scanner n1 = new Scanner (System.in)) {
			System.out.println("\n \t ¿Desea saber más acerca de los engranajes y sus funciones?"
					+ " \n \t \t \t \t(1) Si "
					+ " \t (2) No ");
			
			
			String propuesta;
			int selector1;
			selector1 = n1.nextInt();
			
				switch (selector1)
				{
				case 1: propuesta = engranajes();
						return propuesta;
				case 2: propuesta = "De acuerdo, vuelve cuando quieras";		
						return propuesta;
				default: return "No te he entendido, vuelve a ejecutar el programa \n y prueba a responder: \"(1) Si o (2) No\"";
			}
		}
	}
	
		
	
	public String engranajes() {
		
		String engranaje = "";
		boolean select_ok = true;
		int selector2;
			try (Scanner n2 = new Scanner (System.in)) {
				System.out.println("Introduce el tipo de engranaje sobre el cual quieres saber más:"
						+ " \"(1) Recto\", "
						+ " \"(2) Helicoidal\", "
						+ " \"(3) Conico\", "
						+ " \"(4) de tornillo\" o"
						+ " \"(5) Hipoide\" ");
	  
				do {
				selector2 = n2.nextInt();
				select_ok = true;
		
				switch(selector2) {
					case 1:
						engranaje = Tiposdemecanismos.eleccionengranaje("Recto");
						break;
					case 2:
						engranaje = "2";
						break;
					case 3:
						engranaje = "3";
						break;
					case 4:
						engranaje = "4";
						break;
					case 5:
						engranaje = "5";
						break;
					default:
						select_ok = false;
						System.out.println("Engranaje no conocido, te sugiero \"(1) Recto, (2) Helicoidal, (3) Conico, (4) de tornillo o (5) Hipoide\" ");
						break;
				}
					  
				} while (select_ok == false);
			}
		return engranaje;
		
	}
	
}
