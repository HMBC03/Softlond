import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Punto_4 {
    public static void main(String[] args) {

        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su edad:_");
        edad = entrada.nextInt();
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }


    }
}
