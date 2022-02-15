import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercadoriaTest {
    @Test
    void deveArmazenarEstados() {
        Mercadoria mercadoria = new Mercadoria();
        mercadoria.setEstado(MercadoriaEstadoEmEstoque.getInstance());
        mercadoria.setEstado(MercadoriaEstadoVendida.getInstance());
        assertEquals(2, mercadoria.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Mercadoria mercadoria = new Mercadoria();
        mercadoria.setEstado(MercadoriaEstadoEmEstoque.getInstance());
        mercadoria.setEstado(MercadoriaEstadoVendida.getInstance());
        mercadoria.restauraEstado(0);
        assertEquals(MercadoriaEstadoEmEstoque.getInstance(), mercadoria.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Mercadoria mercadoria = new Mercadoria();
        mercadoria.setEstado(MercadoriaEstadoEmEstoque.getInstance());
        mercadoria.setEstado(MercadoriaEstadoEmFalta.getInstance());
        mercadoria.setEstado(MercadoriaEstadoEmEstoque.getInstance());
        mercadoria.setEstado(MercadoriaEstadoVendida.getInstance());
        mercadoria.restauraEstado(2);
        assertEquals(MercadoriaEstadoEmEstoque.getInstance(), mercadoria.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Mercadoria mercadoria = new Mercadoria();
            mercadoria.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}