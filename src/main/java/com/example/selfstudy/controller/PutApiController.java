package com.example.selfstudy.controller;

import com.example.selfstudy.dto.PostRequestDto;
import com.example.selfstudy.dto.PostRequestDto2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {

    /*
    @PutMapping("/put")
    public PostRequestDto2 put(@RequestBody PostRequestDto2 requestDto){
        log.info("{}",requestDto);
        return requestDto; // object를 retrun 해도 object mapper를 통해 json 형태로 return 해줌
    }

     */

    @PutMapping("/put/{userId}")
    public PostRequestDto2 put(@RequestBody PostRequestDto2 requestDto, @PathVariable(name = "userId") Long Id){
        log.info("{}",Id);
        return requestDto;
    }

}
