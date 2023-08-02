import java.util.Scanner;

public class Punto_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los numero del arreglo:");

        for (int i = 0; i < n; i++) {
            System.out.print("Siguiente numero: ");
            arreglo[i] = sc.nextInt();
        }

        int maximo = arreglo[0];

        for (int i = 1; i < n; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        System.out.println("El numero mayor es: " + maximo);
    }
}
