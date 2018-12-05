package fp.daw.examen;

import java.util.Random;

public class Ejercicio6 {

	/* 
	 *  2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que cree un vector de números enteros de un
	 * tamaño aleatorio comprendido entre 100 y 500. Una vez creado lo llenará llenará con
	 * números aleatorios comprendidos entre 0 y 1000000. Después de llenar el vector 
	 * mostrará la mínima diferencia entre dos valores adyacentes. La diferencia entre dos
	 * valores adyacentes se calcula como el valor almacenado en cada posición [i] (excepto
	 * la primera) menos el valor almacenado en la posición [i-1].
	 */
		
	public static void main(String[] args) {
		Random r = new Random();
		int longitud = r.nextInt(400)+100;
		int[] array = new int[longitud];

		for(int i=0; i<longitud; i++) {
			array[i] = r.nextInt(1000000);
		}
		
		int menor_dif = 1000000;
		int resta;
		for (int i=1;i<longitud; i++) {
			resta = array[i] - array[i-1];
			resta = Math.abs(resta);
			if(resta < menor_dif) {
				menor_dif = resta;
			}
		}
		
		System.out.println("Menor diferencia entre dos numeros: "+ (menor_dif));
	}

}
