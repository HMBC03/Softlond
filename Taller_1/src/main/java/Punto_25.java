import java.util.Scanner;

public class Punto_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split("\\s+");

        System.out.println("Palabras en la frase:");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
