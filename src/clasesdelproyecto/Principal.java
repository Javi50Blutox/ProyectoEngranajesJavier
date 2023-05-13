package clasesdelproyecto;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Esta es la clase principal de ejecución del proyecto 
		//para la asignatura TicII
		//Aquí se incluye el funcionamiento
	
		
		
		
		EntradaDatos ed = new EntradaDatos();
		
		String def = ed.def();
		System.out.println(" \t Definición de engranajes y características comunes de estos: \n \n" + def );
		
		
		
		String propuesta = ed.propuestaparacuriosos();
		System.out.println(propuesta);
		
	}

}
