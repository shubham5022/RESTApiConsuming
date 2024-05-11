package com.atquil.covid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class CovidService {

    private static final String URL = "https://covid-19-tracking.p.rapidapi.com/v1";

    private static final String XRapidAPIKey = "8c773de218msh535bd52c7692a7dp1978c4jsnc19ebc6b4e79";

    private static final String XRapidAPIHost = "covid-19-tracking.p.rapidapi.com";

    @Autowired
    private RestTemplate restTemplate;

    public Object getAllCountryCovidData() {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.add("X-RapidAPI-Key", XRapidAPIKey);
            headers.add("X-RapidAPI-Host", XRapidAPIHost);

            RequestEntity<Object> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, new URI(URL));

            return restTemplate.exchange(requestEntity, Object.class).getBody();
        } catch (URISyntaxException e) {
            System.out.println("Invalid URL: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Invalid URL");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Exception occurred");
        }
    }
}
