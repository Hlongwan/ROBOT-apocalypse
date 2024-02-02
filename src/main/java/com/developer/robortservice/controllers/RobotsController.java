package com.developer.robortservice.controllers;

import com.developer.robortservice.entity.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/robots")
public class RobotsController {

    private static final String URL = "https://robotstakeover20210903110417.azurewebsites.net/robotcpu";
    private RestTemplate restTemplate;

    @Autowired
    public void RobotController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public RobotsController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/all")
    public List<Robot> getAllRobots() {
        Robot[] robotsArray = restTemplate.getForObject(URL, Robot[].class);

        if (robotsArray != null && robotsArray.length > 0) {
            return Arrays.asList(robotsArray);
        } else {
            return Arrays.asList(new Robot(-1, "No Robots Found", null, null));
        }
    }
}


