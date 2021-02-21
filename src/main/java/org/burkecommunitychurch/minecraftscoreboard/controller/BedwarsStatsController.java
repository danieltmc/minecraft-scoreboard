package org.burkecommunitychurch.minecraftscoreboard.controller;

import java.io.IOException;
import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.constant.BedwarsStatsKeyEnum;
import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsStatsDTO;
import org.burkecommunitychurch.minecraftscoreboard.service.BedwarsStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/api/scores/bedwarsstats", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class BedwarsStatsController {
    @Autowired
    private BedwarsStatsService service;

    @GetMapping("/all")
    public List<BedwarsStatsDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/key/{key}")
    public List<BedwarsStatsDTO> getByKey(
        //@PathVariable String key
        @PathVariable BedwarsStatsKeyEnum key
    ) throws IOException {
        return service.getAllByKey(key);
    }
}
