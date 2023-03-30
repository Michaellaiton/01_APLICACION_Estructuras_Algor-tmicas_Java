import java.util.Scanner;
public class Reto1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double K, C;

        System.out.println("Favor de ingresar los grados Celsius ó Centigrados que quiere convertir");
        C = input.nextDouble();

        K = C + 273.15;

        System.out.println(C+"Grados Celsius ó Centigrados equivalen a" +K+"grados kelvin");
    
        double P, G;

        System.out.println("Favor de ingresar la cantidad de personas");
        P = input.nextDouble();
              
        G =   13 * P ;

        System.out.println(P+"Ingresar cantidad de personas" +G+"Ingresar cantidad de Gramos");
    
        
        input.close();
    } 
}