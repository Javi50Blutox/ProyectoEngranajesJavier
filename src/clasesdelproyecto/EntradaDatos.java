
package clasesdelproyecto;

import java.util.Scanner;

public class EntradaDatos {

	String def() {
	String def = "Los engranajes son elementos mecánicos clave que permiten la transmisión precisa \n"
			   + "y eficiente de movimiento y fuerza en la maquinaria. El diseño y configuración de \n"
			   + "todo engranaje tienen en común elementos tales como los dientes, los ejes, la transmisión... ";
	return def;
	}
	
	String propuestaparacuriosos() {
	
		
		try (Scanner n1 = new Scanner (System.in)) {
			System.out.println("\n \t ¿Desea saber más acerca de los engranajes y sus funciones?"
					+ " \n \t \t \t \tSi "
					+ " \t No ");
			
			
			String propuesta;
			int selector1;
			selector1 = n1.nextInt();
			
				switch (selector1)
				{
				case 1:propuesta = "Si";
						return propuesta;
				case 2: propuesta = "No";		
						return propuesta;
				 default: return "No te he entendido, vuelve a ejecutar el programa \n y prueba a responder: \"Si o No\"";
			}
		}
	}
	
		
	
	String engranajes() {
		
			try (Scanner n2 = new Scanner (System.in)) {
			System.out.println("Introduce el tipo de engranaje sobre el cual quieres saber más:"
									+ " \"Recto\", "
									+ " \"Helicoidal\", "
									+ " \"Conico\", "
									+ " \"de tornillo\" o"
									+ " \"Hipoide\" ");
  
					String engranaje;
					int selector2;
					selector2 = n2.nextInt();
	
						  switch(selector2) 
					  
			{
					  
					  case 1: engranaje = "Recto";
									return engranaje;
					  case 2: engranaje = "Helicoidal";
									return engranaje;
					  case 3: engranaje = "Conico";
									return engranaje;
					  case 4: engranaje = "de tornillo";
									return engranaje;
					  case 5: engranaje = "Hipoide";
									return engranaje;
									
									
					  default: return " Engranaje no conocido, te sugiero \"Recto, Helicoidal, Conico, de tornillo o Hipoide\" ";
			}
		}
	}
}
