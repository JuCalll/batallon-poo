package src.model;
import java.util.ArrayList;
import java.util.List;
import src.enums.TipoEscuadra;

public class Escuadra {
    // Atributos
    private String nombre;
    private int numero;
    private TipoEscuadra tipo; // Enum
    private List<Soldado> soldados; // Relación 1..*
    private static int maxSoldadosPorEscuadra = 12; // Static

    // Constructor
    public Escuadra(String nombre, int numero, TipoEscuadra tipo) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.soldados = new ArrayList<>();
    }

    // Métodos
    public void agregarSoldado(Soldado s) {
        if (tieneCapacidadDisponible()) {
            this.soldados.add(s);
        } else {
            System.out.println("Error: La escuadra esta llena.");
        }
    }

    public void removerSoldadoPorNombre(String nombre) {
        soldados.removeIf(s -> s.getNombre().equals(nombre));
    }

    public int contarSoldados() {
        return soldados.size();
    }

    public boolean tieneCapacidadDisponible() {
        return soldados.size() < maxSoldadosPorEscuadra;
    }

    public List<Soldado> obtenerSoldadosAptos() {
        List<Soldado> aptos = new ArrayList<>();
        for (Soldado s : soldados) {
            if (s.esAptoParaMision()) {
                aptos.add(s);
            }
        }
        return aptos;
    }

    // Método Estático
    public static void cambiarMaximoSoldados(int nuevoMaximo) {
        maxSoldadosPorEscuadra = nuevoMaximo;
    }
    
    public String getNombre() { return nombre; }
    public List<Soldado> getSoldados() { return soldados; }
}