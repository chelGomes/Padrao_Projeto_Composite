import java.util.ArrayList;
import java.util.List;

public class Livro extends Biblioteca{

    private List<Biblioteca> bibliotecas;

    public Livro(String exibirInformacoes){
        super(exibirInformacoes);
        this.bibliotecas = new ArrayList<>();
    }

    public void addBiblioteca(Biblioteca biblioteca){
        this.bibliotecas.add(biblioteca);
    }

    public String getBiblioteca() {
        return bibliotecas.toString() + ", Autor inexistente";
    }
}
