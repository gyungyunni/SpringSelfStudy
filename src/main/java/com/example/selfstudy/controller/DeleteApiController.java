package com.example.selfstudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class DeleteApiController {
    @RequestMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account){ // 삭제할 userID, 쿼리 파라미터로 사용자 계정, delete 메소드 같은 경우는 여러가지 값을 받을 필요 없이 특정 db인덱스 같은것을 받기 때문에
      log.info("{}",userId); // db나 서비스 로직이 따로 없어서 그냥 delete 하는 Id 출력 하는 정도만 화긴
      log.info("{}",account);
      //delete -> 리소스 삭제 200 ok
    }
}
