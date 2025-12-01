package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import model.Escuadra;
import model.Soldado;
import enums.TipoEscuadra;
import enums.RangoSoldado;

public class EscuadraTest {
    @Test
    public void testAgregarSoldado() {
        // Arrange
        Escuadra escuadra = new Escuadra("Alpha", 1, TipoEscuadra.INFANTERIA);
        Soldado s1 = new Soldado("Perez", 22, RangoSoldado.CABO);
        
        // Act
        escuadra.agregarSoldado(s1);
        
        // Assert
        assertEquals(1, escuadra.contarSoldados());
    }
}