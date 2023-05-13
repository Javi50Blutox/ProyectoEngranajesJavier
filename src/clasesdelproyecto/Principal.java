package clasesdelproyecto;


public class Principal {

	public static void main(String[] args) {
		
		
		// Referencia a la clase EntradaDatos
		EntradaDatos ed = new EntradaDatos();
		
		// Obtener la definición de los engranajes
		String def = ed.def(); 
		System.out.println(" \t Definición de engranajes y características comunes de estos: \n \n" + def );
		
		// Ofrecer una propuesta en caso de querer obtener más información sobre los engranajes
		String propuesta = ed.propuestaparacuriosos();
		System.out.println(propuesta);
		
	}

}
