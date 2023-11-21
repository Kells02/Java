import java.util.Scanner;

public class El_barret_de_hogwarts {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in); // Crea un objeto
        System.out.println(); // El input

        String palabra = myobj.nextLine(); // Lee el input y lo almacena en el objeto

        if (palabra.equals("Coratge")) {
            System.out.println("Gryffindor");
        }

        else if (palabra.equals("Coneixement")){
            System.out.println("Ravenclaw");
        }

        else if (palabra.equals("Ambicio")){
            System.out.println("Slytherin");
        }

        else {
            System.out.println("Hufflepuff");
        }
    }   
}