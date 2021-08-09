import java.util.Scanner;

public class Exercise9 {
    //Write a program that computes your initials from your full name and displays them.
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String nombre = "";

        System.out.print("Escriba su nombre: ");
        nombre = datos.nextLine();

        String iniciales [] = nombre.split(" ");

        for (int i = 0; i < iniciales.length; i++) {
            iniciales[i] = iniciales[i].substring(0,1);
            System.out.print(iniciales[i]);
        }




    }
}
