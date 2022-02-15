public class MercadoriaEstadoExtraviada implements MercadoriaEstado{
    private MercadoriaEstadoExtraviada() {};
    private static MercadoriaEstadoExtraviada instance = new MercadoriaEstadoExtraviada();
    public static MercadoriaEstadoExtraviada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Extraviada";
    }
}
