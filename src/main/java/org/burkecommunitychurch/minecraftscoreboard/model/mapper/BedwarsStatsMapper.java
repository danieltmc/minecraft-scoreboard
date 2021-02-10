package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsStatsDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsStats;

public abstract class BedwarsStatsMapper {
    public BedwarsStatsDTO toDto(BedwarsStats bedwarsStats) {
        BedwarsStatsDTO dto = new BedwarsStatsDTO();
        dto.setPlayerUuid(bedwarsStats.getPlayerUuid());
        dto.setKey(bedwarsStats.getKey());
        dto.setValue(bedwarsStats.getValue());
        return dto;
    }
}
