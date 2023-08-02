import java.util.Scanner;

public class Punto_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número inicial del rango: ");
        int inicio = sc.nextInt();

        System.out.print("Ingrese el número final del rango: ");
        int fin = sc.nextInt();

        System.out.println("Números primos en el rango de " + inicio + " a " + fin + ":");

        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
