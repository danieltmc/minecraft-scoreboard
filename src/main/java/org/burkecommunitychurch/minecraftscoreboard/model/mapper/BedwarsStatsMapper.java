package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<BedwarsStatsDTO> toDtoList(List<BedwarsStats> list) {
        return list.stream().map(bws ->
            toDto(bws))
            .collect(Collectors.toList());
    }

    public List<BedwarsStatsDTO> toDtoList(Collection<BedwarsStats> list) {
        return list.stream().map(bws ->
            toDto(bws))
            .collect(Collectors.toList());
    }
}
