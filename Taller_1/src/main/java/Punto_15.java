import java.util.Scanner;

public class Punto_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int numeroOriginal = numero;
        int numeroReverso = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;
        }

        if (numeroOriginal == numeroReverso) {
            System.out.println(numeroOriginal + " es un número capicúa.");
        } else {
            System.out.println(numeroOriginal + " NO es un número capicúa.");
        }
    }
}
