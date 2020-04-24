package com.cryptenet.cqm;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientDemo {
    public void send() {
        HttpClient client = HttpClient.newHttpClient();
        try {
//            HttpResponse r = client.send(
            HttpResponse response = client.send(
                    HttpRequest.newBuilder().uri(URI.create("https://api.github.com/")).build(),
                    HttpResponse.BodyHandlers.ofString()
            );
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
