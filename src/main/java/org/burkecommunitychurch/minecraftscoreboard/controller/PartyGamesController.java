package org.burkecommunitychurch.minecraftscoreboard.controller;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.PartyGamesDTO;
import org.burkecommunitychurch.minecraftscoreboard.service.PartyGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/api/scores/partygames", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class PartyGamesController {
    @Autowired
    private PartyGamesService service;

    @GetMapping("/all")
    public List<PartyGamesDTO> getAll() {
        return service.getAll();
    }
}
