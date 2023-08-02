import javax.swing.*;

public class Punto_2 {
    public static void main(String[] args) {
        int num1;
        String result;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        if ((num1%2)==0){
            result="Par";
        }else{
            result="Impar";
        }
        JOptionPane.showMessageDialog(null,"El numero es : "+ result);
    }


}
