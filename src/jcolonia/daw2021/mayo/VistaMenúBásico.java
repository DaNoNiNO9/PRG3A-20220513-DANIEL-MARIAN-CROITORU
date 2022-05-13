package jcolonia.daw2021.mayo;


import java.util.Scanner;

/**
 * Vista Menu crea el menu que se usara en el proyecto. Basado en VistaMenuEstadios.
 * @author Daniel Marian Croitoru
 *
 */
public class VistaMenúBásico extends Vista {
	/**
	 * Define el texto para identificar las opciones
	 */
	private String [] textoOpciones;
	
	/**
	 * Constructor de la clase
	 * @param titulo 
	 * @param sc gestiona la salida por pantalla
	 * @param textoOpciones define el texto para identificar las opciones
	 * 
	 */
	public VistaMenúBásico (String titulo, Scanner sc, String [] textoOpciones) {
		super(titulo, sc);
		
		this.textoOpciones = new String[textoOpciones.length];
	
		for (int i = 0; i < textoOpciones.length; i++) {
	
			this.textoOpciones[i] = textoOpciones[i];
		}
	}
	/**
	 * Muestra el menu. En VistaMenuEstadios se denominaba mostrarMenu.
	 */
	public void mostrarOpciones() {
		for(int i=0; i<textoOpciones.length; i++)
		{
			System.out.printf(" #%d  --  %s%n", (i+1), textoOpciones[i]);
		}
	}
	/** 
	 * Definira una entrada por teclado la cual el usuario elegira la opcion
	 * @return numero elegido
	 * 
	 */
	public int pedirOpcion() {
		String lineaTexto = "";
		int numero = 0;
		boolean numEsCorrecto = false;
		Scanner entrada = getEntrada();
		
		System.out.println("Introduce la opcion del menu elegida");
		while(!numEsCorrecto)
		{
			try {
				lineaTexto = entrada.nextLine();
				numero = Integer.parseInt(lineaTexto);
				
				if(numero <= 0 || numero > textoOpciones.length)
				{
					System.out.println("No ha elegido una opcion valida");
				} else {
					numEsCorrecto = true;
				}
			} catch (NumberFormatException e) {
				System.out.printf("\tNo es una de las opciones validas: <<%s>>%n", e.getMessage());
			}
		}
    	
    	return numero;
	}

}
