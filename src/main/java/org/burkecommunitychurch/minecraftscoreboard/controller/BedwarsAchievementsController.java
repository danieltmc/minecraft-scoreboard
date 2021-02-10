package org.burkecommunitychurch.minecraftscoreboard.controller;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsAchievementsDTO;
import org.burkecommunitychurch.minecraftscoreboard.service.BedwarsAchievementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/scores/bedwarsachievements", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class BedwarsAchievementsController {
    @Autowired
    private BedwarsAchievementsService service;

    @GetMapping("/all")
    public List<BedwarsAchievementsDTO> getAll() {
        return service.getAll();
    }
}
