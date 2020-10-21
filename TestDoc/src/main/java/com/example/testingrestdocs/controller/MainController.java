package com.example.testingrestdocs.controller;

import com.example.testingrestdocs.TestingRestdocsApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class MainController {

    @GetMapping("/get")
    private Mono<String> getDataInfo(){
        return Mono.just("Hello world");
    }

}
