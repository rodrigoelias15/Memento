import java.util.ArrayList;
import java.util.List;

public class Mercadoria {

    private MercadoriaEstado estado;
    private List<MercadoriaEstado> memento = new ArrayList<MercadoriaEstado>();

    public MercadoriaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(MercadoriaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<MercadoriaEstado> getEstados() {
        return this.memento;
    }
}
