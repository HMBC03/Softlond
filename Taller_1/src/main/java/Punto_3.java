import java.util.Scanner;

import static java.lang.Math.*;

public class Punto_3 {
    public static void main(String[] args) {
        double radio, area;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo:_");
        radio = entrada.nextDouble();
        area=(PI*pow(radio,2));
        System.out.println("El area del circulo es: "+area);

    }
}
