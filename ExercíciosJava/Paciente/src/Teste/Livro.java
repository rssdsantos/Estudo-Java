package Teste;

public class Livro {

    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto = false;
    private Aluno leitor;

    //METODOS

    public void folhear(int p){
        if (p > this.totPaginas){
            System.out.println("Impossivel avançar tantas páginas");
        } else {
            this.pagAtual = p + this.pagAtual;
            System.out.println(this.pagAtual);
        }

    }

    public Livro(String titulo, String autor, int totPaginas, Aluno leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Aluno leitor) {
        this.leitor = leitor;
    }

    public void leitura(){
        System.out.println("O livro "+ this.getTitulo() + " do autor " + this.getAutor() );
        System.out.println("Está sendo lido por " + leitor.getNome() );
        System.out.println("A pagina atual é a " + this.getPagAtual());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Aluno getLeitor() {
        return leitor;
    }
}
