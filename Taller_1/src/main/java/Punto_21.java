import java.util.Scanner;



public class Punto_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena,letra;
        String[] array = null;
        int contador=0;
        System.out.print("Ingrese un una cadena de texto:_ ");
        cadena = sc.next();
        array = cadena.split("");
        System.out.print("Que letra desea ver si se repite:_");
        letra = sc.next();
        for (int i = 0; i < cadena.length(); i++) {

            if (array[i].equals(letra)){
                contador++;

            }
        }
        System.out.print("El numero de veces que se repite la letra '"+letra+"' es :" +contador);

    }
}
