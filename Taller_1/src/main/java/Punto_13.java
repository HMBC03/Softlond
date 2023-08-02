import java.util.Scanner;

public class Punto_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        double numero = sc.nextDouble();

        System.out.print("Ingrese la cantidad de decimales a mostrar: ");
        int decimales = sc.nextInt();

        double redondeado = Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);

        System.out.println("El número redondeado a " + decimales + " decimales es: " + redondeado);
    }
}
