import javax.swing.*;

import static java.lang.Integer.*;

public class Calculadora {
    public static double resultado;
public static double sumar(double numero1, double numero2){
    numero1+=numero2;

 return numero1;
}
    public static double restar(double numero1, double numero2){
        numero1-=numero2;
        return numero1;
    }
    public static double multiplicar(double numero1, double numero2){
        numero1*=numero2;
        return numero1;
    }
    public static double dividir(double numero1, double numero2){
        numero1/=numero2;
        return numero1;
    }

    public static void main(String[] args) {
        double numero1=parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer valor"));
        double numero2=parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo valor"));


        int opc=parseInt(JOptionPane.showInputDialog(null,"Selecciones la operación\n"+"1.Suma\n"+"2.Resta\n"+"3.Multiplicación\n"+"4.División"));
        switch (opc){
            case 1:
                    resultado=sumar(numero1,numero2);
                break;
            case 2:
                    resultado=restar(numero1,numero2);
                break;
            case 3:
                    resultado=multiplicar(numero1,numero2);
                break;

            case 4:
                    resultado=dividir(numero1,numero2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta");

        }
        JOptionPane.showMessageDialog(null, "El resultado de la operacion es: "+resultado);
    }
}
