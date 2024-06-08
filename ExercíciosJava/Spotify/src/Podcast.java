public class Podcast extends Audio implements Front{
    private String criador;
    private String categoria;


    /*public Podcast(String nome, double duracao, String criador, String categoria) {
        this.nome = nome;
        this.duracao = duracao;
        this.visualizacao =0;
        this.criador = criador;
        this.categoria = categoria;
        this.avaliacao =0;
    }*/

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void play() {
        visualizacao++;
    }

    @Override
    public void avaliar(int f) {
        avaliacao = f;
    }

    @Override
    public void apresentar(){
        System.out.println("O Podcast: " + this.nome);
       // System.out.println("Tem duracao de: " + duracao +"m");
        System.out.println("O criador é: " + criador);
        System.out.println("A categoria é: " + categoria);
        System.out.println("Tem exatamente: " + duracao + "m de duração");
        System.out.println("Sua avaliacao é de: " + avaliacao);
        System.out.println("E tem " + visualizacao + " de visualizações");


    }


}
