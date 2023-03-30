import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {
        Scanner estado = new Scanner(System.in);
        int Numero;
        String Estado;

        System.out.println("Digite el nombre del estudiante");
        Estado=estado.next();
        if (Estado.equals("Jaramillo")) {
            System.out.println("Usted ya se ha registrado a algun auxilio");
        } else {  
        System.out.println("Digite a que subcidio desaea registrarse registrarse");
        System.out.println(" Ponga (0) para subsidio de tranporte");
        System.out.println("Ponga (1) para subsidio de alimentacion");
        System.out.println("Ponga (2) para apoyo de sostenimiento regular");
        System.out.println("Ponga (3) para apoyo de sostenimiento FIC");
        System.out.println("Ponga (4) para el apoyo digital  Plan de datos");
        Numero=estado.nextInt();

        if(Numero==0){
        System.out.println("Se ha registrado al auxilio de transporte");
     } 
     else if (Numero==1){
        System.out.println("Se ha registrado al auxilio de alimentacion");
        } 
        else if (Numero==2)
        {
        System.out.println("Se ha registrado al auxilio de sostenimiento regular");
        }
         else if (Numero==3)
         {
        System.out.println("Se ha registrado al auxilio de sostenimiento FIC");
        } 
        else if (Numero==4)
        {
        System.out.println("Se ha registrado al auxilio de apoyo digital - Plan de datos");
        } else {
        System.out.println("Ha digitado un valor incorrecto");    
        } 
        }
     estado.close();
    }
}

