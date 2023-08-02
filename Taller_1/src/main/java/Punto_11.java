import java.util.Scanner;

public class Punto_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = sc.nextDouble();

        double s = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        System.out.println("El área del triángulo es: " + area);
    }
}
