package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsAchievementsDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsAchievements;
import org.mapstruct.Mapper;

@Mapper
public abstract class BedwarsAchievementsMapper {
    public BedwarsAchievementsDTO toDto(BedwarsAchievements bedwarsAchievements) {
        BedwarsAchievementsDTO dto = new BedwarsAchievementsDTO();
        dto.setPlayerUuid(bedwarsAchievements.getPlayerUuid());
        dto.setId(bedwarsAchievements.getId());
        dto.setEarnDate(bedwarsAchievements.getEarnDate());
        return dto;
    }

    public List<BedwarsAchievementsDTO> toDtoList(List<BedwarsAchievements> list) {
        return list.stream().map(bwa ->
            toDto(bwa))
            .collect(Collectors.toList());
    }

    public List<BedwarsAchievementsDTO> toDtoList(Collection<BedwarsAchievements> list) {
        return list.stream().map(bwa ->
            toDto(bwa))
            .collect(Collectors.toList());
    }
}
