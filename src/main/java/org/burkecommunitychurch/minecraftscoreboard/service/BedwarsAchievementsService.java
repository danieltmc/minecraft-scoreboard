package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsAchievementsDTO;

public interface BedwarsAchievementsService {
    public List<BedwarsAchievementsDTO> getAll();
}
