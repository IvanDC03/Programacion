package com.utad.dawe.app;

import com.utad.dawe.model.JugadorBalonMano;

public class Equipo {

	public static void main(String[] args) {
//Jugador 1
		JugadorBalonMano persona1 = new JugadorBalonMano("Juan", 3);
		JugadorBalonMano.tiempoJugado(1, 2, 3);
		JugadorBalonMano.tiempoJugado(4, 1, 3);
		JugadorBalonMano.tiempoJugado(2, 5, 8);
		JugadorBalonMano.tiempoJugado(3, 1, 7);
		JugadorBalonMano.tiempoJugado(2, 4, 6);
		JugadorBalonMano.tiempoJugado(2, 1, 8);
		JugadorBalonMano.tiempoJugado(3, 5, 2);
		JugadorBalonMano.tiempoJugado(9, 1, 5);
		JugadorBalonMano.tiempoJugado(7, 5, 2);
		JugadorBalonMano.tiempoJugado(8, 1, 5);
//Jugador 2
		JugadorBalonMano persona2 = new JugadorBalonMano("Alberto", 5);
		JugadorBalonMano.tiempoJugado(1, 4, 8);
		JugadorBalonMano.tiempoJugado(7, 5, 2);
		JugadorBalonMano.tiempoJugado(4, 6, 9);
		JugadorBalonMano.tiempoJugado(2, 5, 8);
		JugadorBalonMano.tiempoJugado(4, 7, 2);
		JugadorBalonMano.tiempoJugado(3, 1, 9);
		JugadorBalonMano.tiempoJugado(2, 7, 5);
		JugadorBalonMano.tiempoJugado(3, 1, 2);
		JugadorBalonMano.tiempoJugado(2, 4, 8);
		JugadorBalonMano.tiempoJugado(4, 6, 5);
//Estadisticas 
		int totalDatos = JugadorBalonMano + JugadorBalonMano;
		int media = JugadorBalonMano + JugadorBalonMano / totalDatos;

	}
}
