package Model;

public class Zombie extends Enemigo {
	private int nivelDeEnfermedad;

	public Zombie(int vida, int fuerza, int velocidad, int nivelDeEnfermedad) {
		super(vida, fuerza, velocidad);
		this.nivelDeEnfermedad = nivelDeEnfermedad;
	}

	public int getNivelDeEnfermedad() {
		return nivelDeEnfermedad;
	}

	public String getTipo() {
		return "Zombie";
	}

	public int atacar(Personaje player) {
		int damage = super.getFuerza();
		int vida = player.getVida();
		garras(player);

		return player.getVida();
	}

	public int garras(Personaje player){
		System.out.println("Zombie usa garras.");
		int indice = (int) ((Math.random()*100)+1);
		indice = this.nivelDeEnfermedad + indice;
		if (indice == 100){
			System.out.println("Zombie a aplicado un efecto de estado negativo.");
			System.out.println("El Nivel de Enfermedad es: "+ indice);
			System.out.println(player.getName() + " ahora esta Enfermo.");
			System.out.println(player.getName() + " pierde " + indice + " de vida.");
		} else {
			nivelDeEnfermedad = indice;
			System.out.println("Zombie a aplicado un efecto de estado negativo.");
			System.out.println("Tu Nivel de Enfermedad es: "+ indice);
			System.out.println("Resistes la Enfermedad.");
		}
		return this.nivelDeEnfermedad;
	}
}