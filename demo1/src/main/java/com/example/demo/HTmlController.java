package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HTmlController {


    @GetMapping("/")
   public String homePage(){

       return Demo1Application.kimenet().toString();
   }
}
