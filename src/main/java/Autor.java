public class Autor {

    private Biblioteca nome;

    public void setNome(Biblioteca nome){
        this.nome = nome;
    }

    public String getNome(){
        if(this.nome == null){
            throw new NullPointerException("Autor inexistente");
        }
        return this.nome.getBiblioteca();
    }
}
