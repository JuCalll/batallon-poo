package model;
import java.util.ArrayList;
import java.util.List;
import enums.TipoPeloton;

public class Peloton {
    // Atributos
    private String nombre;
    private String comandante;
    private TipoPeloton tipo; // Enum
    private List<Escuadra> escuadras; // Relación 1..*
    private static int maxEscuadras = 4; // Static

    // Constructor
    public Peloton(String nombre, String comandante, TipoPeloton tipo) {
        this.nombre = nombre;
        this.comandante = comandante;
        this.tipo = tipo;
        this.escuadras = new ArrayList<>();
    }

    // Métodos
    public void agregarEscuadra(Escuadra e) {
        if (escuadras.size() < maxEscuadras) {
            escuadras.add(e);
        } else {
            System.out.println("Error: El peloton no admite mas escuadras.");
        }
    }

    public void removerEscuadraPorNombre(String nombre) {
        escuadras.removeIf(e -> e.getNombre().equals(nombre));
    }

    public int contarEscuadras() {
        return escuadras.size();
    }

    public int contarTotalSoldados() {
        int total = 0;
        for (Escuadra e : escuadras) {
            total += e.contarSoldados();
        }
        return total;
    }

    public boolean esPelotonCompleto() {
        return escuadras.size() == maxEscuadras;
    }

    // Método Estático
    public static void cambiarMaxEscuadras(int nuevoMax) {
        maxEscuadras = nuevoMax;
    }
    
    public String getNombre() { return nombre; }
    public String getComandante() { return comandante; }
    public TipoPeloton getTipo() { return tipo; }
    public List<Escuadra> getEscuadras() { return escuadras; }
}