package com.xxx.scaffold.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scaffold")
public class ScaffoldController {

    @GetMapping
    public String testScaffoldApi() {
        return "scaffold api test";
    }
}
