import java.util.Scanner;

public class Punto_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        if (esPalindromo(frase)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase NO es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String frase) {
        // Eliminamos espacios y convertimos todo a minúsculas
        frase = frase.replaceAll("\\s+", "").toLowerCase();

        int inicio = 0;
        int fin = frase.length() - 1;

        while (inicio < fin) {
            if (frase.charAt(inicio) != frase.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }

        return true;
    }
}
