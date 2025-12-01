package main;
import java.util.Scanner;
import model.Batallon;
import model.Peloton;
import model.Escuadra;
import model.Soldado;
import enums.TipoBatallon;
import enums.TipoPeloton;
import enums.TipoEscuadra;
import enums.RangoSoldado;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Datos iniciales de prueba
        Batallon batallon = new Batallon("Batallon Alpha", "Norte", TipoBatallon.MECANIZADO);
        Peloton peloton = new Peloton("Peloton 1", "Sargento Garcia", TipoPeloton.ASALTO);
        Escuadra escuadra = new Escuadra("Escuadra Cobra", 1, TipoEscuadra.INFANTERIA);
        
        batallon.agregarPeloton(peloton);
        peloton.agregarEscuadra(escuadra);

        int opcion = 0;
        do {
            System.out.println("\n--- GESTION DE BATALLON ---");
            System.out.println("1. Agregar Soldado a Escuadra Cobra");
            System.out.println("2. Ver Reporte del Batallon");
            System.out.println("3. Cambiar codigo OTAN (Static)");
            System.out.println("4. Salir");
            System.out.print("Ingrese opcion: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del soldado: ");
                    String nombre = scanner.next();
                    Soldado s = new Soldado(nombre, 20, RangoSoldado.SOLDADO);
                    escuadra.agregarSoldado(s);
                    System.out.println("Soldado agregado.");
                    break;
                case 2:
                    System.out.println(batallon.generarReporteResumen());
                    break;
                case 3:
                    System.out.print("Nuevo codigo: ");
                    String codigo = scanner.next();
                    Batallon.cambiarCodigoOTAN(codigo);
                    System.out.println("Codigo cambiado globalmente.");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }
}