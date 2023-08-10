package Clase_4;
import java.util.ArrayList;
import java.util.List;

public class ArrayLista{

    public static void main(String[] args)
    {
        ArrayList<String>ListaEnteros = new ArrayList();
        ListaEnteros.add("2");
        ListaEnteros.add("1");
        ListaEnteros.add("13");

        for(String dato: ListaEnteros){
            System.out.println(dato);
        }
        //IMPRIMIR UN NUMERO ESPECIFICO
        System.out.print(ListaEnteros);
    }
}