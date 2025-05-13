package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicioMoneda {
    private final String apiKey;
    private final HttpClient clienteHttp;
    private final Gson gson;

    public ServicioMoneda(String apiKey) {
        this.apiKey = apiKey;
        this.clienteHttp = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public double convertir(String desde, String hacia, double cantidad) {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + desde;

        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try {
            HttpResponse<String> respuesta = clienteHttp.send(solicitud, HttpResponse.BodyHandlers.ofString());
            RespuestaCambio datos = gson.fromJson(respuesta.body(), RespuestaCambio.class);

            if (!"success".equals(datos.resultado)) {
                return -1;
            }

            Double tasaCambio = datos.tasasConversion.get(hacia);
            return tasaCambio != null ? cantidad * tasaCambio : -1;

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
