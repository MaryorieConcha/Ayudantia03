package Model;

public abstract class Enemigo {
	private int vida;
	private int fuerza;
	private int velocidad;
	private Dungeon calabozo;

	public abstract String getTipo();
	public abstract void atacar();

	public Enemigo(int vida, int fuerza, int velocidad) {
		this.vida = vida;
		this.fuerza = fuerza;
		this.velocidad = velocidad;
	}

	public int getVida() {
		return vida;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getVelocidad() {
		return velocidad;
	}
}