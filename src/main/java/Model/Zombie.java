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

	public void atacar() {
		garras();
	}

	public int garras(){
		System.out.println("Zombie usa garras.");
		int indice = (int) ((Math.random()*100)+1);
		indice = this.nivelDeEnfermedad + indice;
		if (indice == 100){
			System.out.println("Zombie a aplicado un efecto de estado negativo.");
			System.out.println("Tu Nivel de Enfermedad es: "+ indice);
			System.out.println("Ahora estas Enfermo.");
			System.out.println("Pierdes " + indice + " de vida.");
		} else {
			nivelDeEnfermedad = indice;
			System.out.println("Zombie a aplicado un efecto de estado negativo.");
			System.out.println("Tu Nivel de Enfermedad es: "+ indice);
			System.out.println("Resistes la Enfermedad.");
		}
		return this.nivelDeEnfermedad;
	}
}