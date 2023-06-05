package com.example.selfstudy.controller;

import com.example.selfstudy.dto.GetUserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController //해당 클래스는 Rest API 처리하는 컨트롤러
@RequestMapping("/api/get") // RequestMapping은 주소를 지정해주는 어노테이션 http://localhost:9090/api/get
public class GetApiController {
    // 첫번째 방법
    @GetMapping("/hello") //http://localhost:9090/api/get/hello
    public String hello(){
        return "hello spring boot";
    }

    //두번째 방법 //http://localhost:9090/api/get/hi
    @RequestMapping(path = "/hi" , method = RequestMethod.GET)
    public String Hi(){
        return "안녕";
    }


    /*
    // Path Variable ver1
    // http://localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name){
        System.out.println("PathVariable : " + name);
        return name;
    }

     */


    // Path Variable ver2   @Getmapping의 pathvariable에 name을 적었는데 변수 이름은 다르게 설정해야할 때
    // http://localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{a}")
    public String pathVariable(@PathVariable(name = "a") String pathName){
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }



    // map 으로 query-param 받기
    // http://localhost:9090/api/get/query-param?name=mk&age=26
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");
            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    // 명확하게 지정해주는 방식, 변수가 많아지면 변수 추가해줘야하는 단점
    //http://localhost:9090/api/get/query-param02?name=mk&email=mk@naver.com&age=26
    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name + " " + email + " " + age;
    }

    //현업에서 가장 많이 쓰이는 dto 쓰는 방법
    @GetMapping("query-param03")
    public String queryParam03(GetUserRequest getUserRequest){
        System.out.println(getUserRequest.getName());
        System.out.println(getUserRequest.getEmail());
        System.out.println(getUserRequest.getAge());

        return getUserRequest.toString();
    }
}
