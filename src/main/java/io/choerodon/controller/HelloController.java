package io.choerodon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zenger on 2018/5/21.
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Demo project for Spring Boot !";
    }
}

