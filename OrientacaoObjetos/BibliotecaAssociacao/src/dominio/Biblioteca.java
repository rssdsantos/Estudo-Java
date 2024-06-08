package dominio;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Biblioteca {
    private String nome;
    private Livro [] livros;
    private Autor autor;


    public Biblioteca(String nome, Livro[] livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("A biblioteca: " + nome + "\n");
        if (livros != null){
            System.out.println("Contém os livros: ");
        for (Livro livros : livros ) {
            if (livros.getAutor() == null) {
                System.out.println(livros.getNome() + " autor desconhecido " + "\n");
            } else {
            System.out.println(livros.getNome() + " do autor " + livros.getAutor().getNome() +  "\n"); }

        }

        } else {
            System.out.println("Não contem livros.");
        }

    }




    public void adicionarlivro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o título do livro ");
        String titulo = entrada.nextLine();
        System.out.println("Digite o autor do livro ");
        String autor1 = entrada.nextLine();

        Livro livro = new Livro(titulo);
        Autor autor = new Autor(autor1);

        livro.setAutor(autor);

        if (livros == null) {
            livros = new Livro[1];
            livros[0] = livro;
        } else {
            Livro[] novoArrayLivros = new Livro[livros.length + 1];
            System.arraycopy(livros, 0, novoArrayLivros, 0, livros.length);
            novoArrayLivros[livros.length] = livro;
            livros = novoArrayLivros;
        }

    }




}
