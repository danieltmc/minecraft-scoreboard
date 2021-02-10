package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsAchievementsDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsAchievements;

public abstract class BedwarsAchievementsMapper {
    public BedwarsAchievementsDTO toDto(BedwarsAchievements bedwarsAchievements) {
        BedwarsAchievementsDTO dto = new BedwarsAchievementsDTO();
        dto.setPlayerUuid(bedwarsAchievements.getPlayerUuid());
        dto.setId(bedwarsAchievements.getId());
        dto.setEarnDate(bedwarsAchievements.getEarnDate());
        return dto;
    }
}
