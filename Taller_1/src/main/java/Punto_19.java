import java.util.Scanner;

public class Punto_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
        System.out.println("Nombre en minúsculas: " + nombre.toLowerCase());
    }
}
