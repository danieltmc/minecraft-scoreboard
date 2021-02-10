package org.burkecommunitychurch.minecraftscoreboard.controller;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.TowerDefenseDTO;
import org.burkecommunitychurch.minecraftscoreboard.service.TowerDefenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/scores/towerdefense")
public class TowerDefenseController {
    @Autowired
    private TowerDefenseService service;

    @GetMapping("/all")
    public List<TowerDefenseDTO> getAll() {
        return service.getAll();
    }
}
