import javax.swing.*;

public class Punto_1 {
//PUNTO 1 DEL TALLER 1 RESUELTO CON LIBRERIA SWING
    public static void main(String[] args) {
        int num1, num2, result;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo numero entero"));
        result=num1+num2;
        JOptionPane.showMessageDialog(null,"La suma es : "+ result);
    }

}
