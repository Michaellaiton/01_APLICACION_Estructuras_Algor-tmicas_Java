import java.util.*;

public class Reto7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int Piedra;
        int Tijera;
        int Papel;
        int Vidas = 3;
        boolean volverAjugar = true;
        do{
            System.out.println("Seleccione Piedra (0)");
             Piedra= scanner.nextInt();
             System.out.println("Seleccione Tijera (1)");
             Tijera= scanner.nextInt();
             System.out.println("Seleccione Papel (2)");
             Papel= scanner.nextInt();
        }while(Piedra !=0 && Tijera != 1 && Papel !=2);
        int resultado = random.nextInt(2);
        if (resultado == Piedra+Papel+Tijera){
            System.out.println("Ganaste te quedan 3 vidas");
        }while(volverAjugar){
            System.out.println("Vidas restantes"+ Vidas);
            break;
        }if(resultado == Papel+Tijera+Piedra){
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