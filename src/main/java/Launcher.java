import Model.*;

public class Launcher {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Personaje personaje = new Personaje();
        Personaje jugador1 = new Personaje("Jugador 1",200,40,20);
        Personaje mago1 = new Personaje("Mago 1",150,30,25,55);

        Enemigo zombie = new Zombie(100,30,15,0);
        Enemigo bones = new Bones(50,20,20,30);
        Enemigo boss = new Boss(250,45,25,0);

        personaje.enfrentarEnemigo(zombie,jugador1);
        System.out.println(" ");
        personaje.enfrentarEnemigo(bones,mago1);
        System.out.println(" ");
        personaje.enfrentarEnemigo(boss,jugador1);
        System.out.println(" ");
        personaje.atacar(mago1,jugador1);
        System.out.println(" ");
        System.out.println("Vida restante de " + jugador1.getName() + ": " + jugador1.getVida());
    }
}
