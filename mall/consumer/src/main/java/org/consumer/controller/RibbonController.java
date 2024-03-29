package org.consumer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getPoducerInfo")
    public String getPoducerInfo() {
        String result = this.restTemplate.getForObject("http://spring-cloud-producer/getPortInfo", String.class);
        return result;
    }
}