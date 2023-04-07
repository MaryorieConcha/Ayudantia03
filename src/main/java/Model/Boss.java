package Model;

public class Boss extends Enemigo {
	private int indicadorDeCansancio;

	public String getTipo() {
		return "Boss";
	}

	public Boss(int vida, int fuerza, int velocidad, int indicadorDeCansancio) {
		super(vida, fuerza, velocidad);
		this.indicadorDeCansancio = indicadorDeCansancio;
	}

	public int ponerADormir(){
		int indice = (int) ((Math.random()*100)+1);
		indice = this.indicadorDeCansancio + indice;
		if (indice == 100){
			System.out.println("Boss ha aplicado un efecto de estado negativo.");
			System.out.println("Tu indicador de Cansancio es: "+ indice);
			System.out.println("Ahora estas dormido.");
			return 100;
		} else {
			indicadorDeCansancio = indice;
			System.out.println("Boss a aplicado un efecto de estado negativo.");
			System.out.println("Tu indicador de Cansancio es: "+ indice);
			System.out.println("Resistes el sueño.");
		}
		return this.indicadorDeCansancio;
	}

	public int atacar(Personaje player) {
		ataqueDeBoss();
		int damage = super.getFuerza();
		int vida = player.getVida();
		ponerADormir();
		if (ponerADormir() == 100){
			System.out.println("Boss realiza un ataque devastador.");
			vida = vida - damage*4;
			player.setVida(vida);
			return player.getVida();
		} else {
			System.out.println("Boss realiza un ataque.");
			vida = vida - damage;
			player.setVida(vida);
			return player.getVida();
		}
	}

	public String ataqueDeBoss(){
		return "Boss ataca.";
	}
}