package Model;

import java.util.ArrayList;

public class Dungeon {
	private String nombreDelDungeon;
	private ArrayList<Personaje> jugadores = new ArrayList<Personaje>();
	private ArrayList<Enemigo> monstruos = new ArrayList<Enemigo>();

	public Enemigo agregarZombies (Zombie zombie) {
		this.monstruos.add(zombie);
		return zombie;
	}

	public Enemigo agregarBones (Bones bones) {
		this.monstruos.add(bones);
		return bones;
	}

	public Enemigo agregarBoss (Boss boss) {
		this.monstruos.add(boss);
		return boss;
	}

	public Personaje agregarJugadores (Personaje jugador){
		this.jugadores.add(jugador);
		return jugador;
	}


}