package com.sahanbcs.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {


    @GetMapping("/patient-service")
    public String doctorService(){
        return "The patient  Micro Service Called ";
    }

    @GetMapping("/patient-service/{patient}")
    public String doctorDetail(@PathVariable String patient){
        return "The patient Detail is  "+ patient ;
    }



}
