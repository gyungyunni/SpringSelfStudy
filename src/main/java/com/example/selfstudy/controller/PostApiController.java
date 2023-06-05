package com.example.selfstudy.controller;

import com.example.selfstudy.dto.PostRequestDto;
import com.example.selfstudy.dto.PostRequestDto2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post01")
    public void post(@RequestBody Map<String, Object> requestData){
        requestData.forEach((key, value) ->{
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });
    }
    /* 위 코드는 람다식 적용한거. 람다식 적용안한 코드는
        public void post(@RequestBody Map<String, Object> requestData) {
        for (Map.Entry<String, Object> entry : requestData.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        }
    }
     */
    @PostMapping("/post02")
    public void post(@RequestBody PostRequestDto requestData){
        System.out.println(requestData);
    }
    @PostMapping("/post03")
    public void post(@RequestBody PostRequestDto2 requestData){
        log.info("{}", requestData);

    }
}
