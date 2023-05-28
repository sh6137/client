package com.example.client.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Req<T> {
    private Header header;

    private T resBody;
    @Data
    @ToString
    public static class Header{
        private String responseCode;
    }
}
