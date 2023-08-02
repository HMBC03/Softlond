import java.util.Scanner;

public class Punto_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        int cantidadCaracteres = contarCaracteresSinEspacios(cadena);

        System.out.println("La cadena contiene " + cantidadCaracteres + " caracteres (sin contar los espacios).");
    }

    public static int contarCaracteresSinEspacios(String cadena) {
        return cadena.replaceAll("\\s+", "").length();
    }
}
