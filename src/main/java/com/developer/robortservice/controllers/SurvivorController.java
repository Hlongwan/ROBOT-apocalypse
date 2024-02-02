package com.developer.robortservice.controllers;


import com.developer.robortservice.entity.Resource;
import com.developer.robortservice.entity.Survivor;
import com.developer.robortservice.repositories.ReportRepo;
import com.developer.robortservice.repositories.ResourcesRepo;
import com.developer.robortservice.repositories.SurvivorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/survivor")
public class SurvivorController<InfectionStatistics> {

    @Autowired
    private SurvivorsRepo survivorsRepo;

    @Autowired
    private ResourcesRepo resoursesRepo;
    @Autowired
    private ReportRepo reportRepo;



    //Registering survivor

    @PostMapping("/registerSurvivor")
    public ResponseEntity<Survivor> registerSurvivor(@RequestBody Survivor survivor) {
        return ResponseEntity.ok(survivorsRepo.save(survivor));
    }

    @PostMapping("/registerResources")
    public ResponseEntity<Resource> registerResources(@RequestBody Resource resource) {
        return ResponseEntity.ok(resoursesRepo.save(resource));
    }


 // getting all the survivors

    @GetMapping("/getAllSurvivors")
    public ResponseEntity<List<Survivor>> getAllSurvivors() {

        return ResponseEntity.ok(survivorsRepo.findAll());
    }



    //Update survivor location


    @PutMapping("/{id}/update-location")
    public ResponseEntity<String> updateSurvivorLocation(
            @PathVariable UUID id,
            @RequestParam double longitude,  @RequestParam double latitude) {
        var existingSurvivor = survivorsRepo.findById(id);

        if (existingSurvivor.isPresent()) {
            existingSurvivor.get().setLocation(longitude,latitude);
            survivorsRepo.save(existingSurvivor.get());
            return ResponseEntity.ok("Survivor location updated successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Survivor not found.");
        }
    }

    //Flag survivor as infected



    @GetMapping("/getSurvivorStatus")
    public ResponseEntity<String> getSurvivorStatus(@PathVariable UUID id) {
        Survivor survivor = survivorsRepo.getReferenceById(id);

        if (survivor.isInfected()) {
            return ResponseEntity.ok("Survivor is infected");
        } else {
            return ResponseEntity.ok("Survivor is not infected");
        }
    }
//calculating percentage
    @GetMapping("/getSurvivorPercentage")
    public ResponseEntity<String> getSurvivorPercentage() {
        List<Survivor> allSurvivors = survivorsRepo.findAll();
        int totalSurvivors = allSurvivors.size();
        int infectedCount = 0;

        for (Survivor survivor : allSurvivors) {
            if (survivor.isInfected()) {
                infectedCount++;
            }
        }

        double infectedPercentage = ((double) infectedCount / totalSurvivors) * 100;
        double nonInfectedPercentage = 100 - infectedPercentage;

        return ResponseEntity.ok("Infected Percentage: " + infectedPercentage +
                "%\nNon-Infected Percentage: " + nonInfectedPercentage + "%");
    }

    //geting infected status
    @GetMapping("/getInfectedSurvivors")
    public ResponseEntity<List<Survivor>> getInfectedSurvivors() {
        List<Survivor> infectedSurvivors = survivorsRepo.findByInfected(true);
        return ResponseEntity.ok(infectedSurvivors);
    }

    //getting non infected
    @GetMapping("/getNonInfectedSurvivors")
    public ResponseEntity<List<Survivor>> getNonInfectedSurvivors() {
        List<Survivor> nonInfectedSurvivors = survivorsRepo.findByInfected(false);
        return ResponseEntity.ok(nonInfectedSurvivors);
    }

    //getting the list
    @GetMapping("/getRobots")
    public ResponseEntity<List<Resource>> getRobots() {
        List<Resource> robots = resoursesRepo.findByType("Robot");
        return ResponseEntity.ok(robots);
    }






}
