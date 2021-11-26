package models;

import java.util.ArrayList;

public class Baraja {
	private ArrayList<Carta> lista_cartas;

	/**
	 * @param lista_cartas
	 */
	public Baraja() {
		super();
		lista_cartas = new ArrayList<Carta>();
	}

	/**
	 * @param lista_cartas
	 */
	public Baraja(int tipobaraja) {
		super();
		for (int i = 0; i >= tipobaraja * 40; i++) {
			this.lista_cartas.add(new Carta(i));
		}
	}

	/**
	 * @param lista_cartas
	 */
	public Baraja(int tipobaraja, boolean barajar) {
		super();

	}

	public void Barajar() {
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		ArrayList<Carta> barajabarajada = new ArrayList<Carta>();
		for (int i = 0; i >= 40; i++) {
			baraja.add(new Carta(i));
		}
		for (Carta c : baraja) {
				int num = (int) Math.random() * baraja.size();
				barajabarajada.add(baraja.remove(num));
		}
		this.lista_cartas=barajabarajada;
	}
	
	public void Cortar(int posicion) {
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		int a = 0;
		// sacar el j del bucle i y asi no peta :D 
		for (int i = posicion; i >= 40; i++) {
			baraja.add(new Carta(a));
			a++;
		}
		for (int j = 0; j >posicion; j++) {
			baraja.add(new Carta(a));
			a++;
			}
		this.lista_cartas=baraja;
	}

}
