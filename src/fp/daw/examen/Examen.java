package fp.daw.examen;

public class Examen {
	public static boolean contiene(String[] vector, String cadena) {
//		for (int i = 0; i<vector.length; i++) {
//			if (cadena.equals(vector[i])) {
//				return true;
//			}
//		}
//		return false;
		
		int i=0;
		while(i<vector.length && !cadena.equals(vector[i])) {
			i++;
		}
		
		return i<vector.length;
	}
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'contiene' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
		String [] vector = {"C1", "C2", "C3", "C4"};
		System.out.println(contiene(vector, "C4"));
	}
}

}
