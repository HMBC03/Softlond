import java.util.Scanner;

public class Punto_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número para la serie de Fibonacci: ");
        int numero = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.println("Serie Fibonacci hasta " + numero + ":");

        while (a <= numero) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
