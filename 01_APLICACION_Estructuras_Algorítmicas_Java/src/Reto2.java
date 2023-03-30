import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  
        int PesoBB;
        int MesesBB;
        int DosisBB=0;
        int FechaAct;
        int FechaNac;
        int EdadBB=0;
        System.out.println("Escriba el Peso del Bebe");
        PesoBB = teclado.nextInt();
        System.out.println("Escriba los meses del Bebe");
        MesesBB = teclado.nextInt();
        System.out.println("La dosis del Bebe es:"+ DosisBB);
        DosisBB = teclado.nextInt();
        DosisBB = (PesoBB + 15/MesesBB * 10);
        System.out.println("Escriba la Fecha Actual");
        FechaAct = teclado.nextInt();
        System.out.println("Escriba La fecha de Nacimiento");
        FechaNac = teclado.nextInt();
        System.out.println("La edad del bebe es:" +EdadBB);
        EdadBB = teclado.nextInt();
        EdadBB = FechaAct-FechaNac;
        teclado.close();
}
}