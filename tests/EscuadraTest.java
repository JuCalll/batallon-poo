package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import src.model.Escuadra;
import src.model.Soldado;
import src.enums.TipoEscuadra;
import src.enums.RangoSoldado;

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