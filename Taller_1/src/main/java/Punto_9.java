import java.util.Scanner;

public class Punto_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
