package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsPropertiesDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsProperties;
import org.mapstruct.Mapper;

@Mapper
public abstract class BedwarsPropertiesMapper {
    public BedwarsPropertiesDTO toDto(BedwarsProperties bedwarsProperties) {
        BedwarsPropertiesDTO dto = new BedwarsPropertiesDTO();
        dto.setPlayerUuid(bedwarsProperties.getPlayerUuid());
        dto.setId(bedwarsProperties.getId());
        dto.setValue(bedwarsProperties.getValue());
        return dto;
    }

    public List<BedwarsPropertiesDTO> toDtoList(List<BedwarsProperties> list) {
        return list.stream().map(bwp ->
            toDto(bwp))
            .collect(Collectors.toList());
    }

    public List<BedwarsPropertiesDTO> toDtoList(Collection<BedwarsProperties> list) {
        return list.stream().map(bwp ->
            toDto(bwp))
            .collect(Collectors.toList());
    }
}
