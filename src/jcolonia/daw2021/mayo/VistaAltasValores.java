package jcolonia.daw2021.mayo;

import static java.lang.System.err;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * @author DanielMarianCroitoru
 *
 */
public class VistaAltasValores extends Vista{
	
	
	private VistaMenúBásico menúPrincipal;

	/**
	 * @param título
	 * @param in
	 */
	public VistaAltasValores(String título, Scanner in, VistaMenúBásico menúGrupo) {
		super(título, in);
		menúPrincipal = menúGrupo;
	}
	
	/**
	 * 
	 */
	public void cargarSumando() {
		Scanner entrada = getEntrada();
		String texto;
		int numero;
		boolean seguir = false;
		while(!seguir) {
			out.println("Numero de espectadores posibles: ");
			try {
				texto=entrada.nextLine();
				if(texto.length() <0) {
					err.println("El dato introducido no puede tener menos de 0 cifras");
				} else {
				numero=Integer.parseInt(texto);
				ListaNúmeros listaNúmeros = new ListaNúmeros();
				listaNúmeros.setNumero(numero);
				seguir = true;
				}
			} catch (NumberFormatException e) {
				err.println("Dato introducido incorrecto");
			}
		}
	}
}
