import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class BibliotecaTest {
    @Test
    void deveRetornarNomeAutor() {
        Livro livro1 = new Livro("Padroes de Criacao");

        Livro livro2 = new Livro("Padroes Estruturais");
        CapituloLivro capituloLivro21 = new CapituloLivro("Padrao Composite", 2);
        livro2.addBiblioteca(livro1);

        Livro livro3 = new Livro("Padroes Comportamentais");
        CapituloLivro capituloLivro31 = new CapituloLivro("Padrao Observer", 3);
        CapituloLivro capituloLivro32 = new CapituloLivro("Padrao State", 4);
        livro3.addBiblioteca(capituloLivro31);
        livro3.addBiblioteca(capituloLivro32);

        Livro nome = new Livro("Padroes de Projeto");
        nome.addBiblioteca(livro1);
        nome.addBiblioteca(livro2);
        nome.addBiblioteca(livro3);

       Autor autor = new Autor();
       autor.setNome(nome);

        assertEquals("Livro: Padroes de Projeto" +
                "Livro: Padroes de Criacao" +
                "Livro: Padroes Estruturais" +
                "Capitulo Livro: Padrao Composite - indice livro: 2" +
                "Livro: Padrões Comportamentais" +
                "CapituloLivro: Padrao Observer - indice livro: 3" +
                "CapiluloLivro: Padrao State - indice livro: 4", autor.getNome());
    }

    @Test
    void deveRetornarExecacaoLivrosSemAutor() {
        try {
            Autor autor = new Autor();
            autor.getNome();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Autor inexistente", e.getMessage());
        }
    }
}
