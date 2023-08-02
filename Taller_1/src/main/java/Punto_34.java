import java.util.Scanner;

public class Punto_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];



        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese elemento:");
            arreglo[i] = sc.nextInt();
        }

        System.out.print("¿Cuántas posiciones desea rotar el arreglo hacia la izquierda?: ");
        int posicionesIzquierda = sc.nextInt();

        int[] arregloRotadoIzquierda = rotarIzquierda(arreglo, posicionesIzquierda);

        System.out.println("Arreglo rotado hacia la izquierda:");

        for (int elemento : arregloRotadoIzquierda) {
            System.out.print(elemento + " ");
        }

        System.out.println();

        System.out.print("¿Cuántas posiciones desea rotar el arreglo hacia la derecha?: ");
        int posicionesDerecha = sc.nextInt();

        int[] arregloRotadoDerecha = rotarDerecha(arreglo, posicionesDerecha);

        System.out.println("Arreglo rotado hacia la derecha:");

        for (int elemento : arregloRotadoDerecha) {
            System.out.print(elemento + " ");
        }
    }

    public static int[] rotarIzquierda(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[(i - posiciones + n) % n] = arreglo[i];
        }

        return resultado;
    }

    public static int[] rotarDerecha(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[(i + posiciones) % n] = arreglo[i];
        }

        return resultado;
    }
}
