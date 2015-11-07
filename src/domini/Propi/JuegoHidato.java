package com.atienza.alejandro;


public class JuegoHidato extends Juego{						//Contiene los métodos y atributos de Juego


	
	public JuegoHidato(){							//Crea un Hidato (tp =1)
		tipo_juego = 1;							
	}

	public JuegoHidato(int diff){						//Crea un Hidato con dificultad diff
		tipo_juego = 1;
		this.diff = diff;
		
	}
	public JuegoHidato(int diff, Tablero t){				//Crea un Hidato con dificultad diff y Tablero t
		tipo_juego = 1;
		tab = t;
		this.diff = diff;
	}

	/*public void generar_juego(){						//Genera un juego aleatorio del tip
		System.out.println("Genero Game HIDATO");
	}*/

	}
