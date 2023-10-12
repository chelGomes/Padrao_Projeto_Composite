
public class CapituloLivro extends Biblioteca{
    private int indiceLivro;

    public CapituloLivro(String exibirInformacoes, int indiceLivro) {
        super(exibirInformacoes);
        this.indiceLivro = indiceLivro;
    }

    public int getIndiceLivro() {
        return indiceLivro;
    }

    public void setIndiceLivro(int indiceLivro){
        this.indiceLivro = indiceLivro;
    }

    public String getBiblioteca() {
        return "Capitulo Livro: " + this.getExibirInformacoes() + " - indice livro: " + this.indiceLivro+ "\n";
    }
}
