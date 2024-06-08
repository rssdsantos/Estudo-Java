package dominio;

public class Autor {
    private String nome;
    private Livro [] livros;

    public Autor(String nome) {
        this.nome = nome;
    }

    public Autor(String nome, Livro[] livros) {
        this.nome = nome;
        this.livros = livros;
    }


    public void imprime(){
        System.out.println(this.nome);
        if(livros == null) return;
        for (Livro livros : livros ) {
            System.out.println(livros.getNome());

        }
    }






    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
