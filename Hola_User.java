import java.util.Scanner;

public class Hola_User {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in); // Crea un objeto
        System.out.println(); // El input

        String nombre = myobj.nextLine(); // Lee el input y lo almacena en el objeto
        System.out.println("Hola, " + nombre); // Imprime
    }
}