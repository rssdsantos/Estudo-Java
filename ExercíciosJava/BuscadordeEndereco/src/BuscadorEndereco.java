import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscadorEndereco {


    String cep;
    String logadouro;
    String bairro;
    String cidade;
    String estado;


    public Molde buscaEndereco(String cep) throws IOException, InterruptedException {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = client
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        Molde molde = gson.fromJson(response.body(), Molde.class);

        this.cep = molde.cep();
        this.logadouro = molde.logradouro();
        this.bairro = molde.bairro();
        this.cidade = molde.localidade();
        this.estado = molde.uf();

        return molde;
    }


    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return   "------------------" + "\n"+
                "Buscador de Endereco" + "\n"+
                "------------------" + "\n"+
                "Cep = " + cep + "\n" +
                "Logadouro = " + logadouro +  "\n" +
                "Bairro = " + bairro +  "\n" +
                "Cidade = " + cidade + "\n" +
                "Estado = " + estado;
    }
}
