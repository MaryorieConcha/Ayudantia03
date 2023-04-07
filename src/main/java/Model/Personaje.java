package Model;

public class Personaje {
	private String name;
	private int vida, fuerza, velocidad;
	private int energiaMagica;
	private Dungeon calabozo;

	public Personaje(String name, int vida, int fuerza, int velocidad) {
		this.name = name;
		this.vida = vida;
		this.fuerza = fuerza;
		this.velocidad = velocidad;
	}

	public Personaje(String name, int vida, int fuerza, int velocidad, int energiaMagica) {
		this.name = name;
		this.vida = vida;
		this.fuerza = fuerza;
		this.velocidad = velocidad;
		this.energiaMagica = energiaMagica;
	}

	public Personaje() {}

	public void enfrentarEnemigo(Enemigo monstruo, Personaje personaje){
		System.out.println(personaje.getName() + " se enfrenta a un enemigo de tipo: " + monstruo.getTipo());
		System.out.println("Estadisticas del enemigo:");
		System.out.println("Vida: " + monstruo.getVida() + ", Fuerza: " + monstruo.getFuerza() + ", Velocidad: " + monstruo.getVelocidad());
		recibirAtaque(monstruo,personaje);
	}

	public int recibirAtaque (Enemigo monstruo,Personaje player){
		monstruo.atacar(player);
		if (player.getVida() == 0 || player.getVida() < 0){
			System.out.println(player.getName() + "ha muerto.");
		}
		return player.getVida();
	}

	public void atacar(Personaje player, Personaje player2){
		System.out.println(player.getName() + " es atacado por: " + player2.getName());
		System.out.println("Ataque inválido.");
		System.out.println("Miembros de la misma party no reciben daño amigo.");
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getName() {
		return name;
	}
}