package com.myAPI.calling.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myAPI.calling.Config.ApiConfig;
import com.myAPI.calling.service.ApiService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/makeMeCum")
@RequiredArgsConstructor
public class ApiController {

	@Autowired
	ApiService apiservice;

	@GetMapping("/girls")
	public ResponseEntity<?> makeHerWild() {
		Object response = apiservice.getReadyBabe();
        if (response != null && response instanceof Map) {
            Map<String, Object> responseBody = (Map<String, Object>) response;
            String url = (String) responseBody.get("url");
            
            System.out.println(url);
            
            if (url != null) {
                return ResponseEntity.ok(url);
            }
        }
        return ResponseEntity.notFound().build();
    }
}