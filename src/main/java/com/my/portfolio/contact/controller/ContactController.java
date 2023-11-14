package com.my.portfolio.contact.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/contact")
public class ContactController {

    @GetMapping
    public String contact() {
        log.info("contact");
        return "contact/contact";
    }
}
