package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Spring!";
    }

    @GetMapping("/my_var")
    public String my_func() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        return "Дмитрий " + formatter.format(date);
    }

}
