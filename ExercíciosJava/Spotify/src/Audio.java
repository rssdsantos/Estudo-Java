import java.util.Scanner;

public abstract class Audio {
    protected String nome;
    protected int visualizacao;
    protected double duracao;

    protected int avaliacao;

    public void apresentar(){

    }


    public void perguntar(){
        visualizacao++;

        System.out.println("Qual o nome da musica que voce escutou? ");
        Scanner teclado2 = new Scanner(System.in);
        nome = teclado2.nextLine();
        System.out.println("------------------");

        System.out.println("Qual a sua nota para a musica? ");
        Scanner teclado = new Scanner(System.in);
        avaliacao = teclado.nextInt();
        System.out.println("------------------");

        System.out.println("Qual a duração da musica? ");
        Scanner teclado3 = new Scanner(System.in);
        duracao = teclado3.nextInt();
        System.out.println("------------------");

    }


}
