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
        System.out.println("vialaner_201605010606");
        return before + param + after;
    }

}
