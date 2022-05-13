package jcolonia.daw2021.mayo;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * Metodo cuya funcion es mostrar por pantalla el listado de datos introducidos en el menu
 * @author Daniel Marian Croitoru
 *
 */
public class VistaListadoValores extends ControlSumatorio {
	
/**
 * @param sc Gestiona la salida por pantalla
 */
public VistaListadoValores(Scanner sc) {
		super(sc);
	}
	/**
	 * Muestra la lista
	 * @param lista
	 */
	public void mostrarLista (ListaNúmeros lista) {
		
		for(int i=0; i<lista.getNúmSumandos(); i++) {
			out.println(lista.consultar(i));
		}
	}
}
