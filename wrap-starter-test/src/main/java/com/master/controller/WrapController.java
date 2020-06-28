package com.master.controller;

import com.master.service.WrapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WrapController {

    @Autowired
    private WrapService wrapService;

    @RequestMapping("/vialaner/{param}")
    public String wrapHandler(@PathVariable("param") String param){
        return wrapService.wrap(param);
    }

}
