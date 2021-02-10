package org.burkecommunitychurch.minecraftscoreboard.controller;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.PartiesPartiesDTO;
import org.burkecommunitychurch.minecraftscoreboard.service.PartiesPartiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/api/scores/partiesparties", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class PartiesPartiesController {
    @Autowired
    private PartiesPartiesService service;

    @GetMapping("/all")
    public List<PartiesPartiesDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/all/kills")
    public List<PartiesPartiesDTO> getAllOrderByKills() {
        return service.getAllOrderByKills();
    }

    @GetMapping("/all/exp")
    public List<PartiesPartiesDTO> getAllOrderByExperience() {
        return service.getAllOrderByExperience();
    }
}
