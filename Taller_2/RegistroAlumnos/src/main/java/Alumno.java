import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private int edad;
    private List<Double> calificaciones;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
    }

    public void asignarCalificacion(double calificacion) {
        calificaciones.add(calificacion);
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }

    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null,"Nombre: "+nombre+".\n"+"Edad: "+ edad+"\n"+" Calificaciones: "+calificaciones+
        "\n"+ "Promedio: "+calcularPromedio());

    }

    public String getNombre() {
        return nombre;
    }
}
