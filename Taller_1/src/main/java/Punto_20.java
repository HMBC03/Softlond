import java.util.Scanner;

public class Punto_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        StringBuilder cadenaInvertida = new StringBuilder(cadena).reverse();

        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}
