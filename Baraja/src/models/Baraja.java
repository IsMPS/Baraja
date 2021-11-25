package models;

import java.util.ArrayList;

public class Baraja {
	private int lista_cartas;
	private Baraja carta;
	private Carta cartaa;

	/**
	 * @param lista_cartas
	 */
	public Baraja() {
		super();
		ArrayList<Baraja> baraja = new ArrayList<Baraja>();
		
	}

	/**
	 * @param lista_cartas
	 */
	public Baraja(int tipobaraja) {
		super();
		switch(tipobaraja) {
		case 1:
			this.lista_cartas = 40;
			break;
		case 2: 
			this.lista_cartas = 80;
			break;
		}
		ArrayList<Baraja> baraja = new ArrayList<Baraja>(this.lista_cartas);
		baraja.add(carta);
	}
}
