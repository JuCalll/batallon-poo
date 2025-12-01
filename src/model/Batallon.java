package model;
import java.util.ArrayList;
import enums.TipoBatallon;
import java.util.List;

public class Batallon {
    // Atributos
    private String nombre;
    private String ubicacion;
    private TipoBatallon tipo; // Enum
    private List<Peloton> pelotones; // Relación 1..*
    private static String codigoOTAN = "BTL-001"; // Static

    // Constructor
    public Batallon(String nombre, String ubicacion, TipoBatallon tipo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.pelotones = new ArrayList<>();
    }

    // Métodos
    public void agregarPeloton(Peloton p) {
        pelotones.add(p);
    }

    public void removerPelotonPorNombre(String nombre) {
        pelotones.removeIf(p -> p.getNombre().equals(nombre));
    }

    public int contarPelotones() {
        return pelotones.size();
    }

    public int contarTotalSoldados() {
        int total = 0;
        for (Peloton p : pelotones) {
            total += p.contarTotalSoldados();
        }
        return total;
    }

    public String generarReporteResumen() {
        return "Batallon: " + nombre + " (" + tipo + ")\n" +
               "Ubicacion: " + ubicacion + "\n" +
               "Total Pelotones: " + contarPelotones() + "\n" +
               "Total Soldados: " + contarTotalSoldados();
    }

    // Método Estático
    public static void cambiarCodigoOTAN(String nuevoCodigo) {
        codigoOTAN = nuevoCodigo;
    }
    
    public static String getCodigoOTAN() {
        return codigoOTAN;
    }
}