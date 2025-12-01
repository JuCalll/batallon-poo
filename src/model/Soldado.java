package model;
import enums.RangoSoldado;

public class Soldado {
    // Atributos
    private String nombre;
    private int edad;
    private RangoSoldado rango; // Atributo Enum
    private String estadoSalud;
    private static int edadMinimaServicio = 18; // Atributo Static

    // Constructor
    public Soldado(String nombre, int edad, RangoSoldado rango) {
        this.nombre = nombre;
        this.edad = edad;
        this.rango = rango;
        this.estadoSalud = "APTO"; // Estado inicial por defecto
    }

    // Métodos que cambian estado
    public void entrenar() {
        System.out.println("El soldado " + this.nombre + " ha completado su entrenamiento.");
    }

    public void asignarRango(RangoSoldado nuevoRango) {
        this.rango = nuevoRango;
    }

    public void marcarComoHerido() {
        this.estadoSalud = "HERIDO";
    }

    // Métodos de consulta
    public boolean esAptoParaMision() {
        return this.edad >= edadMinimaServicio && "APTO".equals(this.estadoSalud);
    }

    public String descripcion() {
        return "Soldado: " + nombre + ", Rango: " + rango + ", Salud: " + estadoSalud;
    }

    // Método Estático
    public static void cambiarEdadMinimaServicio(int nuevaEdad) {
        edadMinimaServicio = nuevaEdad;
    }

    // Getters necesarios para pruebas
    public String getNombre() { return nombre; }
}