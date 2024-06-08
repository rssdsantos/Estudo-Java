public class Main {
    public static void main(String[] args) {
        Video v [] = new Video [3];
        v[0] = new Video("Aula 1 P00");
        v[1] = new Video("Hora da aventura");
        Gafanhoto boy = new Gafanhoto("Rodrigo", 27, "M", "rsdsantos");

        Visualizacao f = new Visualizacao(boy, v[1], 8);
        boy.apresentar();

        f.curtida(boy, v[1]);

        System.out.println(v[0].toString());
        boy.viuMaisUm();
        boy.apresentar();
        v[0].detalhes();
        v[1].detalhes();

        v[0].play();
        v[0].detalhes();

    }
}