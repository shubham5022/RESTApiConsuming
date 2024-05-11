package com.myAPI.calling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class ApiService {
    
    @Autowired
    private RestTemplate restTemplate;
    
    public static final String XRapidAPIKey = "8c773de218msh535bd52c7692a7dp1978c4jsnc19ebc6b4e79";
    public static final String XRapidAPIHost = "girls-nude-image.p.rapidapi.com";
    public static final String URL = "https://girls-nude-image.p.rapidapi.com/?type=clitoris";

    public Object getReadyBabe() {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.add("X-RapidAPI-Key", XRapidAPIKey);
            headers.add("X-RapidAPI-Host", XRapidAPIHost);

            RequestEntity<Object> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, new URI(URL));
            ResponseEntity<Object> responseEntity = restTemplate.exchange(requestEntity, Object.class);
            return responseEntity.getBody();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }
}
