public class MercadoriaEstadoEmEstoque implements MercadoriaEstado{
    private MercadoriaEstadoEmEstoque() {};
    private static MercadoriaEstadoEmEstoque instance = new MercadoriaEstadoEmEstoque();
    public static MercadoriaEstadoEmEstoque getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em estoque";
    }
}
