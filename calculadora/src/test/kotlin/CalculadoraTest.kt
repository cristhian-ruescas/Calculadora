import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest {
    val calculadora = Calculadora()

    @Test
    fun soma() {
        assertEquals(6, calculadora.soma(3, 3))
    }

    @org.junit.jupiter.api.Test
    fun subtracao() {
        assertEquals(6, calculadora.subtracao(9,3))
    }

    @org.junit.jupiter.api.Test
    fun multiplicacao() {
        assertEquals(12, calculadora.multiplicacao(4,3))
    }

    @org.junit.jupiter.api.Test
    fun divisao() {
    assertEquals(3, calculadora.divisao(9,3))
    }
}