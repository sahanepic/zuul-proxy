package com.sahanbcs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiagnosisController {

    @GetMapping("/diagnosis-service/hello")
    public String  hello(){
        return "Hello ";
    }

    @GetMapping("/diagnosis-service")
    public String diagnisisService(){
        return "The Diognosis Micro Service Is Called";
    }

    @GetMapping("/diagnosis-service/{patient}")
    public String diagnisisPatient(@PathVariable String patient){
        return "The Diognosis  Patient  Is  " + patient ;
    }



}
