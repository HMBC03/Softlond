import java.util.Scanner;

public class Punto_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];



        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero:");
            arreglo[i] = sc.nextInt();
        }

        System.out.print("Que numero buscas?: ");
        int numeroBuscado = sc.nextInt();

        int indice = buscarElemento(arreglo, numeroBuscado);

        if (indice != -1) {
            System.out.println("El número se encuentra en el índice: " + indice);
        } else {
            System.out.println("El número no se encuentra en el arreglo.");
        }
    }

    public static int buscarElemento(int[] arreglo, int numero) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                return i;
            }
        }

        return -1; //Cuando no se encuentra
    }
}
