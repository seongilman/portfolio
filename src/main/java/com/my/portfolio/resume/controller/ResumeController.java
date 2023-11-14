package com.my.portfolio.resume.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/resume")
public class ResumeController {

    @GetMapping
    public String resume() {
        log.info("ProjectsController.projects");
        return "resume/resume";
    }
}
