package org.burkecommunitychurch.minecraftscoreboard.controller;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsPropertiesDTO;
import org.burkecommunitychurch.minecraftscoreboard.service.BedwarsPropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/scores/bedwarsproperties")
public class BedwarsPropertiesController {
    @Autowired
    private BedwarsPropertiesService service;

    @GetMapping("/all")
    public List<BedwarsPropertiesDTO> getAll() {
        return service.getAll();
    }
}
