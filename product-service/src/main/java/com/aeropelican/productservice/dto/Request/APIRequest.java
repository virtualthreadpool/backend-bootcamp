package com.aeropelican.productservice.dto.Request;

import lombok.Data;

@Data
public class APIRequest<T> {

    private T data;

}