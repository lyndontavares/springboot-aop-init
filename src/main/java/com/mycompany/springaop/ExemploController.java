package com.mycompany.springaop;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

    @GetMapping("teste1")
    @TrackTime
    public String teste1() {
        return "teste1";
    }

    @GetMapping("teste2")
    @TrackTime
    public ResponseEntity<?> teste2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return  new ResponseEntity(HttpStatus.OK );
    }

}
