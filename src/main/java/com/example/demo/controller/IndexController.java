package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexContreoller
 * @Description 首页地址
 * @Version 1.0
 **/
@Controller
public class IndexController {
    @RequestMapping("/")
    public String show() {
        return "index";
    }
}
