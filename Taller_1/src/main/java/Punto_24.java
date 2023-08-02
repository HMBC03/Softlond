import java.util.Scanner;

public class Punto_24 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese una cadena: ");
            String cadena = sc.nextLine();

            System.out.print("Ingrese la letra a reemplazar: ");
            char letraAntigua = sc.next().charAt(0);

            System.out.print("Ingrese la letra nueva: ");
            char letraNueva = sc.next().charAt(0);

            String nuevaCadena = cadena.replace(letraAntigua, letraNueva);

            System.out.println("La cadena modificada es: " + nuevaCadena);
        }
}
