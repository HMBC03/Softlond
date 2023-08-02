import java.util.Scanner;

public class Punto_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];



        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los numeros del arreglo:");
            arreglo[i] = sc.nextInt();
        }

        int suma = 0;

        for (int elemento : arreglo) {
            suma += elemento;
        }

        System.out.println("La suma de los elementos es: " + suma);
    }
}
