package dominio.test;

import dominio.Autor;
import dominio.Biblioteca;
import dominio.Livro;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("O pequeno principe");
        Livro livro2 = new Livro("A feiticeira");

        Livro[] livros = {livro1, livro2};


        Autor autor1 = new Autor("Alla William", livros);

        livro1.setAutor(autor1);

        autor1.imprime();
        System.out.println("-----");
        livro1.imprime();




    }
}