public class MercadoriaEstadoVendida implements MercadoriaEstado{
    private MercadoriaEstadoVendida() {};
    private static MercadoriaEstadoVendida instance = new MercadoriaEstadoVendida();
    public static MercadoriaEstadoVendida getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Vendida.";
    }
}
