import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        System.out.println("Indique o CEP que deseja buscar: ");
        Scanner leitura = new Scanner(System.in);
        String cep = leitura.next();


        BuscadorEndereco endereco = new BuscadorEndereco();
        endereco.buscaEndereco(cep);
        System.out.println(endereco);

        GeradorDeArquivo gerador = new GeradorDeArquivo();
        gerador.salvaJson(endereco);
    }
}