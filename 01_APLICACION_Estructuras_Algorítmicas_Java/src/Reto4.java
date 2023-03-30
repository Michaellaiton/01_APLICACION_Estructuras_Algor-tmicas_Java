import java.util.*;

public class Reto4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int Piedra;
        int papel;
        int Tijera;
        do{
            System.out.println("Seleccione Piedra y apuesta 4000 (0)");
            Piedra = scanner.nextInt();
            System.out.println("Seleccione papel y apuesta 10000 (1) ");
            papel = scanner.nextInt();
            System.out.println("Seleccione Tijera y Apuesta 20000 (2):");
            Tijera = scanner.nextInt();
        } while (Piedra != 0 && Tijera != 1 && Tijera !=2);
        

        int result = random.nextInt(3);
        if (result == Piedra + papel + Tijera) {
            System.out.println("¡Ganaste 8000!");
            System.out.println("¡Ganaste 20000!");
            System.out.println("¡Ganaste 40000!");
        } else {
            System.out.println("Perdiste 4000");
            System.out.println("Perdiste 10000");
            System.out.println("Perdiste 20000");
        }
        scanner.close();
    }
}