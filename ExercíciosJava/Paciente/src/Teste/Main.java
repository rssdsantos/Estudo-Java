package Teste;

public class Main {
    public static void main(String[] args) {


        Aluno alu = new Aluno("Renata", 15, 9f, 8f);

        alu.fazerAniver();
        alu.apresentar();

        Livro book = new Livro("POO iniciantes", "Flavio", 200, alu);
        book.leitura();
        book.folhear(250);





    }
}