package com.emilakerman.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/base")
public class Controller {
    @GetMapping("/random")
    @ResponseBody
    public String getString() {
        return "Hello World";
    }
}