package com.example.selfstudy.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import java.util.List;

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class PostRequestDto2 {

    private String name;
    private int age;

    private List<CarDto> carList;


}
