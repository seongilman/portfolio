package com.my.portfolio.projects.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/projects")
public class ProjectsController {

    @GetMapping
    public String projects() {
        log.info("ProjectsController.projects");
        return "projects/projects";
    }
}
