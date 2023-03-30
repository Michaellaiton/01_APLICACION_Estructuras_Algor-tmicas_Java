import java.util.*;

public class Reto3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int Moneda;
        do{
            System.out.println("Seleccione Cara (0) y apostar 2000 o Sello (1):");
            Moneda = scanner.nextInt();
        } while (Moneda != 0 && Moneda != 1);

        int result = random.nextInt(2);
        if (result == Moneda) {
            System.out.println("¡Ganaste 4000!");
        } else {
            System.out.println("Perdiste 2000");
        }
        scanner.close();
    }
}