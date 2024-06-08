package dominio;

public class Livro {
    private String nome;
    private Autor autor;


    public Livro(String nome) {
        this.nome = nome;
    }

    public Livro(String nome, Autor autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public void imprime (){
        System.out.println("Nome do Livro: " + this.nome);
        if (autor == null) return;
        System.out.println("O autor é " + autor.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
