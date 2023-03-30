import java.util.*;

public class Reto6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int Moneda;
        int Vidas = 3;
        boolean volverAjugar = true;
        do{
            System.out.println("Seleccione Cara (0)   Sello (1):");
            Moneda = scanner.nextInt();
        }while(Moneda !=0 && Moneda != 1);
        int resultado = random.nextInt(2);
        if (resultado == Moneda){
            System.out.println("Ganaste te quedan 3 vidas");
        }while(volverAjugar){
            System.out.println("Vidas restantes"+ Vidas);
            break;
        }if(resultado == Moneda){
            System.out.println("Perdiste");
            if(Vidas == 0){
                System.out.println("Perdite, ¿Quieres volver a jugar? (s/n)");
                String respuesta = scanner.nextLine();
                if(respuesta.equals("s")){
                    Vidas = 3;
                }else{
                    volverAjugar = false;
                }
            }
        }
        System.out.println("Gracias por jugar");
        scanner.close();
    }
}