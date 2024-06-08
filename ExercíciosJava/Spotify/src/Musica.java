public class Musica extends Audio implements Front{
    private String genero;
    private String cantor;


    public Musica(String nome, double duracao, String genero, String cantor) {
        this.duracao = duracao;
        this.nome = nome;
        this.genero = genero;
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        cantor = cantor;
    }

    @Override
    public void apresentar(){
        System.out.println("A música: " + this.nome);
        // System.out.println("Tem duracao de: " + duracao +"m");
        System.out.println("Tem como cantor: " + cantor);
        System.out.println("A categoria é: " + genero);
        System.out.println("Tem exatamente: " + duracao + "m de duração");
        System.out.println("Sua avaliacao é de: " + avaliacao);
        System.out.println("E tem " + visualizacao + " de visualizações");

    }

    @Override
    public void play() {
        visualizacao++;
    }

    @Override
    public void avaliar(int f) {
        avaliacao =f;

    }



}
