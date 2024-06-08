import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaFilme {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Quer saber qual filme?");
        Scanner leitura = new Scanner(System.in);
        String movie = leitura.next();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?t=" + movie + "&apikey=db9ea1f5"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

       // System.out.println(response.body());

        String json = response.body();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();


        TituloOmdb filmeom = gson.fromJson(json, TituloOmdb.class);
        System.out.println(filmeom);

        try {
            MeuObjeto meuTitulo = new MeuObjeto(filmeom);
            System.out.println("Titulo já convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }



    }


}
