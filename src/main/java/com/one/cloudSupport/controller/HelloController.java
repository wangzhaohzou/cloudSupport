package com.one.cloudSupport.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author wangzhaozhou
 * @date 2019/12/30
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/world")
    public String helloWorld(String str) {
        return "echo：" + str;
    }

}
