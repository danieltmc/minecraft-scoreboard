package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsPropertiesDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsProperties;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.MojangPlayer;
import org.mapstruct.Mapper;

@Mapper
public abstract class BedwarsPropertiesMapper {
    public BedwarsPropertiesDTO toDto(BedwarsProperties bedwarsProperties) {
        BedwarsPropertiesDTO dto = new BedwarsPropertiesDTO();
        dto.setPlayerUuid(bedwarsProperties.getPlayerUuid());

        // Fetch and assign userName
        ObjectMapper objectMapper = new ObjectMapper();
        MojangPlayer mojangPlayer = new MojangPlayer();
        try {
            mojangPlayer = objectMapper.readValue(new URL("https://sessionserver.mojang.com/session/minecraft/profile/"
                    + bedwarsProperties.getPlayerUuid()), MojangPlayer.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        dto.setUserName(mojangPlayer.getName());

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
