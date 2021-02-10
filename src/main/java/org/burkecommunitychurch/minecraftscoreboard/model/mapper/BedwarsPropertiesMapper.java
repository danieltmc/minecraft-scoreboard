package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsPropertiesDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsProperties;

public abstract class BedwarsPropertiesMapper {
    public BedwarsPropertiesDTO toDto(BedwarsProperties bedwarsProperties) {
        BedwarsPropertiesDTO dto = new BedwarsPropertiesDTO();
        dto.setPlayerUuid(bedwarsProperties.getPlayerUuid());
        dto.setId(bedwarsProperties.getId());
        dto.setValue(bedwarsProperties.getValue());
        return dto;
    }
}
