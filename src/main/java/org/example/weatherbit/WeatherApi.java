package org.example.weatherbit;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.example.AppProperties;
import org.example.weatherbit.dto.WeatherDTO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WeatherApi {
    private static final String URL = "https://api.weatherbit.io/v2.0/current?city=%s&key=%s";
    private Gson gson = new Gson();

    public WeatherDTO sendRequest() throws IOException {
        String url = String.format(URL, AppProperties.getProperties().getProperty("weatherbit.city"), AppProperties.getProperties().getProperty("weatherbit.key"));
        url = url.replace(" ", "%20");

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        HttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String responseJson = EntityUtils.toString(entity, StandardCharsets.UTF_8);
        return parseResponse(responseJson);
    }

    private WeatherDTO parseResponse(String json) {
        return gson.fromJson(json, WeatherDTO.class);
    }
}
