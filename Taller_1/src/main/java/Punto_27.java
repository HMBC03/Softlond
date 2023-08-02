import java.util.Arrays;
import java.util.Scanner;

public class Punto_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split("\\s+");
        Arrays.sort(palabras);

        System.out.println("Palabras ordenadas alfabéticamente:");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
