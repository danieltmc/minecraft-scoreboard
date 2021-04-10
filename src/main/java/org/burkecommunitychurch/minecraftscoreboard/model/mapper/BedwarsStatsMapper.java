package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsStatsDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsStats;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.MojangPlayer;
import org.mapstruct.Mapper;

@Mapper
public abstract class BedwarsStatsMapper {
    public BedwarsStatsDTO toDto(BedwarsStats bedwarsStats) {
        BedwarsStatsDTO dto = new BedwarsStatsDTO();
        dto.setPlayerUuid(bedwarsStats.getPlayerUuid());

        // Fetch and assign userName
        ObjectMapper objectMapper = new ObjectMapper();
        MojangPlayer mojangPlayer = new MojangPlayer();
        if (!bedwarsStats.getPlayerUuid().startsWith("00000000")) {
            try {
                mojangPlayer = objectMapper.readValue(new URL("https://sessionserver.mojang.com/session/minecraft/profile/"
                        + bedwarsStats.getPlayerUuid()), MojangPlayer.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            dto.setUserName(mojangPlayer.getName());
        }

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
