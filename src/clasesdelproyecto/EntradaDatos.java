
package clasesdelproyecto;

import java.util.Scanner;

public class EntradaDatos {

	// Método que devuelve una definición de los engranajes
	
	String def() {
	String def = "Los engranajes son elementos mecánicos clave que permiten la transmisión precisa \n"
			   + "y eficiente de movimiento y fuerza en la maquinaria. El diseño y configuración de \n"
			   + "todo engranaje tienen en común elementos tales como los dientes, los ejes, la transmisión... ";
	return def;
	
	}
	
	// Método para ofrecer una continuidad del programa si se solicita más información
	
	public String propuestaparacuriosos() {
	
		
		try (Scanner n1 = new Scanner (System.in)) {
			System.out.println("\n \t ¿Desea saber más acerca de los engranajes y sus funciones?"
					+ " \n \t \t \t(1) Si "
					+ " \t (2) No ");
			
			
			String propuesta;
			int selector1;
			selector1 = n1.nextInt();
			
				switch (selector1)
				{
				case 1: propuesta = engranajes(); //  LLamada al método engranajes()
						return propuesta;
				case 2: propuesta = "De acuerdo, vuelve cuando quieras";		
						return propuesta;
				default: return "No te he entendido, vuelve a ejecutar el programa \n y prueba a responder: \"(1) Si o (2) No\"";
			}
		}
	}
	
		
	// Método para seleccionar un tipo de engranaje y obtener información sobre él
	public String engranajes() {
		
		String engranaje = "";
		boolean select_ok = true;
		int selector2;
			try (Scanner n2 = new Scanner (System.in)) {
				System.out.println("\t Introduce el tipo de engranaje sobre el cual quieres saber más:"
						+ " \n  (1) Recto  "
						+ "  (2) Helicoidal  "
						+ "  (3) Conico  "
						+ "  (4) de tornillo  "
						+ "  (5) Hipoide ");
				//Bucle do-While para repetir el programa en caso de encontrar un parámetro no válido
				do {
				selector2 = n2.nextInt();
				select_ok = true;
				
				// Llamada al método eleccionengranaje() de la clase Tiposdemecanismos en cada uno de los casos
				switch(selector2) {
					case 1:
						engranaje = Tiposdemecanismos.eleccionengranaje("Recto");
						break;
					case 2:
						engranaje = Tiposdemecanismos.eleccionengranaje("Helicoidal");
						break;
					case 3:
						engranaje = Tiposdemecanismos.eleccionengranaje("Conico");
						break;
					case 4:
						engranaje = Tiposdemecanismos.eleccionengranaje("de tornillo");
						break;
					case 5:
						engranaje = Tiposdemecanismos.eleccionengranaje("Hipoide");
						break;
					default:
						select_ok = false;
						System.out.println("\t \t \t Engranaje no conocido, te sugiero:  \n  (1) Recto    (2) Helicoidal    (3) Conico    (4) de tornillo    (5) Hipoide ");
						break;
								}
					  
				} while (select_ok == false);
			}
		return engranaje;
	}
	
}
