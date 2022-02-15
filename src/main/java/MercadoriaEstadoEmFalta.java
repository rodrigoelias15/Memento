public class MercadoriaEstadoEmFalta implements MercadoriaEstado{
    private MercadoriaEstadoEmFalta() {};
    private static MercadoriaEstadoEmFalta instance = new MercadoriaEstadoEmFalta();
    public static MercadoriaEstadoEmFalta getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em falta.";
    }
}
