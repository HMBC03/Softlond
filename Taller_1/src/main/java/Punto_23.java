import java.util.Scanner;

public class Punto_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una oración: ");
        String oracion = sc.nextLine();

        int cantidadPalabras = contarPalabras(oracion);

        System.out.println("La oración contiene " + cantidadPalabras + " palabras.");
    }

    public static int contarPalabras(String oracion) {
        String[] palabras = oracion.split("\\s+");
        return palabras.length;
    }
}
