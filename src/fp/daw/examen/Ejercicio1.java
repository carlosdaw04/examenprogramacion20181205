package fp.daw.examen;

public class Ejercicio1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'contiene' que
	 * reciba dos parámetros: un vector de cadenas de caracteres y una cadena.
	 * El método retornará true si la cadena recibida en el segundo parámetro
	 * se encuentra almacenada en el vector y false en caso contrario.
	 * El método incluirá una única sentencia 'return' y no está permitido el
	 * uso de variables booleanas.
	 */
//	for (int i = 0; i<vector.length; i++) {						//Esta seria la forma de hacerlo con un bucle for y valores booleanos (true y false). A parte de esto tmapoco seria valida porque utiliza dos returns
//	if (cadena.equals(vector[i])) {
//		return true;
//	}
//}
//return false;

	public static boolean contiene(String [] vector, String cadena) { //Entender la definicion de metodos //En la otra parte estamos declarando los parametros en este caso un vecor y una cadena de caracteres
	int i = 0;//Declaramos la i para poeder darle una variable al vector
	while(i<vector.length && !cadena.equals(vector[i])) { //Revisar estructura de bucles while //En este caso creo que dice que mientras i sea menor que que la longitud del vector && la cadena no sea igual al vector[i] entonces i amunete en 1 unidad
		i++; //Cuando se cumple la condicion del while el contenido del vector en este caso i aumneta en una unidad.
	}
	return i<vector.length; //No entiendo porque tiene que retornar esto.
	
	}
}
