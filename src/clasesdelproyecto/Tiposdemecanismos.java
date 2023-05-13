package clasesdelproyecto;


public class Tiposdemecanismos {
	// Método estático que devuelve información sobre un tipo de engranaje según el parámetro "tipo" proporcionado
	static String eleccionengranaje(String tipo) {
		
		String resultado ="";
		
		switch (tipo) {
		case "Recto":
			resultado = "Los engranajes rectos se caracterizan por sus dientes rectilíneos, una relación de transmisión constante, \n"
					+ "alta eficiencia de transmisión de potencia y una tendencia a generar más ruido y vibración en comparación \n"
					+ "con otros tipos de engranajes. Su simplicidad y resistencia los convierten en una opción popular en una va-\n"
					+ "riedad de aplicaciones industriales y mecánicas. Son realmente útiles en aplicaciones con mecanismos simples\n"
					+ "y resistentes.";
			return resultado;
		case "Helicoidal":
			resultado = "Los engranajes helicoidales, conocidos por su forma de hélice,  se caracterizan por dientes helicoidales, \n"
					+ "gran área de contacto, alta capacidad de carga, flexibilidad y su idoneidad para altas cargas y alta veloci-\n"
					+ "dad. Estas características los convierten en una excelente opción cuando se requiere una transmisión suave, \n"
					+ "silenciosa y confiable en diversas industrias. ";
			return resultado;
		case "Conico":
			resultado = "Los engranajes cónicos se caracterizan por la forma del bisel, el ángulo de inclinación, la posibilidad \n"
					+ "de movimiento directo y ángulos de presión, diferentes relaciones de transmisión, alta carga. Estas caracte-\n"
					+ "rísticas los convierten en una opción popular en aplicaciones que requieren una administración de energía \n"
					+ "flexible y un manejo de carga confiable en configuraciones no coaxiales. ";
			return resultado;
		case "de tornillo":
			resultado = "Los engranajes de tornillo se caracterizan por el diseño y diseño de tornillos sinfín, alta relación de \n"
					+ "transmisión, diferentes materiales, alto coeficiente de fricción y uso a baja velocidad, sistema de alto par. \n"
					+ "Estas características los hacen perfectos para aplicaciones especiales que requieren una velocidad reducida\n"
					+ "y un mayor par. ";
			return resultado;
		case "Hipoide":
			resultado = "Los engranajes hipoides se caracterizan por un diseño asimétrico, alto par y alta velocidad de transmi-\n"
					+ "sión, alta conexión, baja vibración y ruido. Son ampliamente utilizados en la industria automotriz y elec-\n"
					+ "trodomésticos. Su diseño único los hace ideales para situaciones en las que se requiere una transmisión de \n"
					+ "energía eficiente y confiable en espacios reducidos. ";
			return resultado;
		
		default:
			return "Elección Incorrecta";
			
						}
	
	}
	
}
