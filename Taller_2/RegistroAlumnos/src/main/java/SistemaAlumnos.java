import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class SistemaAlumnos {
    private List<Alumno> alumnos;

    public SistemaAlumnos() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void asignarCalificacion(String nombreAlumno, double calificacion) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombreAlumno)) {
                alumno.asignarCalificacion(calificacion);
                break;
            }
        }
    }

    public void mostrarInformacionAlumnos() {
        for (Alumno alumno : alumnos) {
            alumno.mostrarInformacion();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SistemaAlumnos sistema = new SistemaAlumnos();
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        do {
            String opcion = JOptionPane.showInputDialog(null,"1.Ingresar un nuevo alumno .\n" +"2.Mostrar Información .\n"+"0.Salir");
            opc =parseInt(opcion);

            switch (opc) {
                case 1:

                    String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del alumno: ");

                    int edad = parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad del alumno: "));
                    Alumno alumno = new Alumno(nombre, edad);
                    sistema.agregarAlumno(alumno);
                    do {
                        double calificacion=parseFloat(JOptionPane.showInputDialog(null,"Ingrese la calificación del alumno: "));

                        sistema.asignarCalificacion(nombre, calificacion);

                        opc = parseInt(JOptionPane.showInputDialog(null,"1.Ingresar nueva calificacion.\n"+"2.Salir"));

                    }while(opc!=2);

                    break;
                case 2:

                    sistema.mostrarInformacionAlumnos();
                    break;
            }


        } while (opc != 0);
    }}
