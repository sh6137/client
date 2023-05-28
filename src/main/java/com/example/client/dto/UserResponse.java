package com.example.client.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserResponse {
    private String name;
    private int age;
}
