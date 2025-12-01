package tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import model.Soldado;
import enums.RangoSoldado;

public class SoldadoTest {
    @Test
    public void testEsAptoParaMision() {
        // Arrange
        Soldado s = new Soldado("Ramirez", 20, RangoSoldado.SOLDADO);
        
        // Act & Assert
        // 1. Debe ser apto recién creado
        assertTrue(s.esAptoParaMision());
        
        // 2. Si lo herimos, no debe ser apto
        s.marcarComoHerido();
        assertFalse(s.esAptoParaMision());
    }
}