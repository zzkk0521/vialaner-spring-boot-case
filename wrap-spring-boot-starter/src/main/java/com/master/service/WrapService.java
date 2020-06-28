package com.master.service;

import lombok.AllArgsConstructor;

/**
 *核心业务类
 */
@AllArgsConstructor
public class WrapService {

    private String before;
    private String after;

    public String wrap(String param){
        return before + param + after;
    }

}
