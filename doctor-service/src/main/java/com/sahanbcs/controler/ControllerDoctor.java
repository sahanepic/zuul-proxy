package com.sahanbcs.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDoctor {

    @GetMapping("/doctor-service/hello")
    public String doctorHello(){
        return "Hello ";
    }

    @GetMapping("/doctor-service")
    public String doctorService(){
        return "The Doctor Micro Service Called ";
    }

    @GetMapping("/doctor-service/{doctor}")
    public String doctorDetail(@PathVariable String doctor){
        return "The Doctor Detail is  "+ doctor ;
    }

}
