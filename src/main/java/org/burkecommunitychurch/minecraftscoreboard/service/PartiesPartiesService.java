package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.PartiesPartiesDTO;

public interface PartiesPartiesService {
    List<PartiesPartiesDTO> getAll();

    List<PartiesPartiesDTO> getAllOrderByKills();

    List<PartiesPartiesDTO> getAllOrderByExperience();
}
