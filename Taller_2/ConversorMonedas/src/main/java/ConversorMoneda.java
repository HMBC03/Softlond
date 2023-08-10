import javax.swing.*;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class ConversorMoneda {
    private static double dolar=4000;
    private double pesos;


    private static double convertirPesos(double cantidad){
        cantidad/=dolar;
        return cantidad;
    }
    private static double convertirdolares(double cantidad) {
        cantidad*=dolar;
        return cantidad;
    }

    public static void main(String[] args) {
        int opc;
        double cantidad;




        opc=parseInt(JOptionPane.showInputDialog(null,"1.Pesos a dolares \n"+"2.Dolares a pesos"));
        switch (opc){
            case 1:
                cantidad=parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de pesos a convertir"));
                JOptionPane.showMessageDialog(null,cantidad+" Pesos son: "+convertirPesos(cantidad) +" Dolares");
                break;
            case 2:
                cantidad=parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dolares a convertir"));
                JOptionPane.showMessageDialog(null,cantidad+" dolares son: "+convertirdolares(cantidad) +" Pesos");
                break;
        }
    }




}
