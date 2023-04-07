package Model;

public class Bones extends Enemigo {
	private int huesos;

	public String getTipo() {
		return "Bones";
	}

	public void atacar() {

	}

	public Bones(int vida, int fuerza, int velocidad, int huesos) {
		super(vida, fuerza, velocidad);
		this.huesos = huesos;
	}

	public String tirarUnHueso(){

		return "Bones lanza un hueso.";
	}


}