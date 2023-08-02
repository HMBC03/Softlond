import java.util.Scanner;

public class Punto_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];



        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese elemento: ");
            arreglo[i] = sc.nextInt();
        }

        ordenarBurbuja(arreglo);

        System.out.println("Version Ordenada:");

        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                }
            }


            if (!intercambio) {
                break;
            }
        }
    }
}
