import java.util.Scanner;

public class Punto_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAdivinar = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int numeroIngresado;

        do {
            System.out.print("Ingresa un número entre 1 y 100: ");
            numeroIngresado = sc.nextInt();
            intentos++;

            if (numeroIngresado > numeroAdivinar) {
                System.out.println("El número a adivinar es menor.");
            } else if (numeroIngresado < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("¡Adivinaste el número en " + intentos + " intentos!");
            }
        } while (numeroIngresado != numeroAdivinar);
    }
}
