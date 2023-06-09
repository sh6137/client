package com.example.client.controller;

import com.example.client.dto.Req;
import com.example.client.dto.UserResponse;
import com.example.client.service.RestTemplateService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ApiController {

    private final RestTemplateService restTemplateService;

    @GetMapping("/hello")
    public UserResponse hello(){
        return restTemplateService.hello();
    }

    @PostMapping("/hello2")
    public UserResponse hello2(){
        return restTemplateService.post();
    }
    @PostMapping("/hello3")
    public UserResponse exchange(){
        return restTemplateService.exchange();
    }

    @PostMapping("/hello4")
    public Req<UserResponse> genericExchange(){
        return restTemplateService.genericExchange();
    }
}
