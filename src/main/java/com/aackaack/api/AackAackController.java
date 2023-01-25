package com.aackaack.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AackAackController {
    @RequestMapping("/test")
    public String index() {
	return "Test Successful.";
    }
}
