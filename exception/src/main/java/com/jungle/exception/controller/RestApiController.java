package com.jungle.exception.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")

public class RestApiController {
    @GetMapping("")
    public void hello(){
        var list = List.of("hello");
        // IndexOutOfBoundsException 에러
        var element = list.get(1);

        log.info("element : {}",element);

    }
}
