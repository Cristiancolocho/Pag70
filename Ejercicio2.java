/*Crear una clase entidad llamada Alumno con las propiedades: Código, Nombre y Carnet. Encapsule las
propiedades y agregue los constructores. A partir de esta entidad crear una lista genérica de tipo ArrayList,
insértele valores y luego muéstrelos en pantalla.
 */

 import java.util.ArrayList;

class Alumno {
    private int codigo;
    private String nombre;
    private String carnet;

    // Constructor
    public Alumno(int codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // Insertar valores
        listaAlumnos.add(new Alumno(1, "Juan Pérez", "A001"));
        listaAlumnos.add(new Alumno(2, "Ana López", "A002"));
        listaAlumnos.add(new Alumno(3, "Carlos Ruiz", "A003"));

        // Mostrar en pantalla
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}