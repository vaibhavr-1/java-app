package com.mira.poc.controller;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChumaApi {
    @GetMapping("/get")
    public ResponseEntity<?> getApi() throws UnirestException {
        HttpResponse<JsonNode> response = Unirest.get("https://randomuser.me/api/")
                .asJson();

        int statusCode = response.getStatus();
        return ResponseEntity.ok(response.getBody().toString());

    }
}
