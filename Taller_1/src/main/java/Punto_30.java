import java.util.ArrayList;
import java.util.Scanner;

public class Punto_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");

        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }

        int[] arregloSinDuplicados = eliminarDuplicados(arreglo);

        System.out.println("Nuevo arreglo sin duplicados:");

        for (int elemento : arregloSinDuplicados) {
            System.out.print(elemento + " ");
        }
    }

    public static int[] eliminarDuplicados(int[] arreglo) {
        ArrayList<Integer> listaSinDuplicados = new ArrayList<>();

        for (int elemento : arreglo) {
            if (!listaSinDuplicados.contains(elemento)) {
                listaSinDuplicados.add(elemento);
            }
        }

        int[] resultado = new int[listaSinDuplicados.size()];

        for (int i = 0; i < listaSinDuplicados.size(); i++) {
            resultado[i] = listaSinDuplicados.get(i);
        }

        return resultado;
    }
}
