package org.burkecommunitychurch.minecraftscoreboard.controller;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.TowerDefenseDTO;
import org.burkecommunitychurch.minecraftscoreboard.service.TowerDefenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/api/scores/towerdefense", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class TowerDefenseController {
    @Autowired
    private TowerDefenseService service;

    @CrossOrigin
    @GetMapping("/all")
    public List<TowerDefenseDTO> getAll() {
        return service.getAll();
    }
}
