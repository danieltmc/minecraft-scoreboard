package org.burkecommunitychurch.minecraftscoreboard.controller;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.OneInTheBattleDTO;
import org.burkecommunitychurch.minecraftscoreboard.service.OneInTheBattleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/scores/oneinthebattle")
public class OneInTheBattleController {
    @Autowired
    private OneInTheBattleService service;

    @GetMapping("/all")
    public List<OneInTheBattleDTO> getAll() {
        return service.getAll();
    }
}
