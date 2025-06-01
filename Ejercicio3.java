/*Crear una lista de tipo LinkedList con la misma entidad que el ejercicio anterior. Inserte valores y muéstrelos
en pantalla. */

import java.util.LinkedList;

// Reutilizamos la clase Alumno del ejercicio anterior
class Alumno {
    private int codigo;
    private String nombre;
    private String carnet;

    public Alumno(int codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        LinkedList<Alumno> listaAlumnos = new LinkedList<>();

        // Insertar valores
        listaAlumnos.add(new Alumno(1, "Esmeralda Pérez", "A001"));
        listaAlumnos.add(new Alumno(2, "Ana López", "A002"));
        listaAlumnos.add(new Alumno(3, "Jenny Ruiz", "A003"));

        // Mostrar en pantalla
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}
