package org.burkecommunitychurch.minecraftscoreboard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.TheWallsDTO;
import org.burkecommunitychurch.minecraftscoreboard.service.TheWallsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/api/scores/towerdefense", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class TheWallsController {
    @Autowired
    private TheWallsService service;

    @CrossOrigin
    @GetMapping("/all")
    public List<TheWallsDTO> getAll() {
        return service.getAll();
    }
}
