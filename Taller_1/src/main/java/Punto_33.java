import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Punto_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];



        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un elemento: ");
            arreglo[i] = sc.nextInt();
        }

        Map<Integer, Integer> frecuenciaElementos = contarFrecuencia(arreglo);

        System.out.println("Frecuencia de elementos en el arreglo:");

        for (Map.Entry<Integer, Integer> entry : frecuenciaElementos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " veces");
        }
    }

    public static Map<Integer, Integer> contarFrecuencia(int[] arreglo) {
        Map<Integer, Integer> frecuenciaElementos = new HashMap<>();

        for (int elemento : arreglo) {
            frecuenciaElementos.put(elemento, frecuenciaElementos.getOrDefault(elemento, 0) + 1);
        }

        return frecuenciaElementos;
    }
}
