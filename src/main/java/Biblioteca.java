public abstract class Biblioteca {
    private String exibirInformacoes;

    public Biblioteca(String exibirInformacoes){
        this.exibirInformacoes = exibirInformacoes;
    }

    public String getExibirInformacoes() {
        return exibirInformacoes;
    }

    public void setExibirInformacoes(String exibirInformacoes) {
        this.exibirInformacoes = exibirInformacoes;
    }

    public abstract String getBiblioteca();
}
