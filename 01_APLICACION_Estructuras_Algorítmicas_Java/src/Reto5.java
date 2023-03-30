import java.util.*;
public class Reto5 {
    public static void main(String[] args) {
        Scanner Lectura= new Scanner(System.in);
        String NombreEmp="0", NombrePro, NombreCli;
        int cantidadPro, total=0, PrecioPro;
        System.out.println("Ingrese el nombre del Empleado");
        NombreEmp = Lectura.next();

    for(int i=1; i==1; i++){
        if (NombreEmp.equals("Julian")){
            System.out.println("Nombre del Cliente");
            NombreCli = Lectura.next();
            System.out.println("Nombre del Producto");
            NombrePro = Lectura.next();
            System.out.println("Cantidad de productos");
            cantidadPro = Lectura.nextInt();
            System.out.println("Digite el precio del Producto");
            PrecioPro = Lectura.nextInt();
            System.out.println("El nombre del Emplead@ es: " +NombreEmp);
            System.out.println("El nombre del cliente es: "+NombreCli );
            System.out.println("El nombre del producto es:"+NombrePro);
            System.out.println("La cantidad de la compra es: "+cantidadPro );
            System.out.println("El total es "+total);
            total=(cantidadPro*PrecioPro);
            
            break;
        
        }
    }
        
    System.out.println("No se encuentra registrado");
                System.out.println("Registrese por favor");
                NombreEmp=Lectura.next();
                System.out.println();
                    System.out.println("Ingrese por favor el nombre del cliente: ");
                    NombreCli=Lectura.next();
                    System.out.println("Ingrese por favor el nombre del producto: ");
                    NombrePro=Lectura.next();
                    System.out.println("Ingrese por favor la cantidad de productos: ");
                    cantidadPro=Lectura.nextInt();
                    System.out.println("Ingrese por favor el precio del producto: ");
                    PrecioPro=Lectura.nextInt();
                    total=(cantidadPro*PrecioPro);
                    System.out.println("el nombre del empleado es: " +NombreEmp);
                    System.out.println("el nombre de su cliente es: " +NombreCli);
                    System.out.println("el nombre de su  producto es: " +NombrePro);
                    System.out.println("la cantidad de su compra es: " +cantidadPro);
                    System.out.println("el total de su compra es: " +total);

                    Lectura.close();
    }
}