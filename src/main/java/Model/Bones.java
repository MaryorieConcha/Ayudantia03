package Model;

public class Bones extends Enemigo {
	private int huesos;

	public String getTipo() {
		return "Bones";
	}

	public int atacar(Personaje player) {
		return player.getVida();
	}

	public Bones(int vida, int fuerza, int velocidad, int huesos) {
		super(vida, fuerza, velocidad);
		this.huesos = huesos;
	}

	public String tirarUnHueso(){

		return "Bones lanza un hueso.";
	}


}