package org.burkecommunitychurch.minecraftscoreboard.controller;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.SurvivalGamesDTO;
import org.burkecommunitychurch.minecraftscoreboard.service.SurvivalGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/api/scores/survivalgames", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class SurvivalGamesController {
    @Autowired
    private SurvivalGamesService service;

    @GetMapping("/all")
    public List<SurvivalGamesDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/coins")
    public List<SurvivalGamesDTO> getAllOrderByCoins() {
        return service.getAllOrderByCoins();
    }

    @GetMapping("/kills")
    public List<SurvivalGamesDTO> getAllOrderByKills() {
        return service.getAllOrderByKills();
    }

    @GetMapping("/deaths")
    public List<SurvivalGamesDTO> getAllOrderByDeaths() {
        return service.getAllOrderByDeaths();
    }

    @GetMapping("/wins")
    public List<SurvivalGamesDTO> getAllOrderByWins() {
        return service.getAllOrderByWins();
    }

    @GetMapping("/gamesplayed")
    public List<SurvivalGamesDTO> getAllOrderByGamesPlayed() {
        return service.getAllOrderByGamesPlayed();
    }
}
