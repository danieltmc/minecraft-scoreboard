package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsAchievementsDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsAchievements;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.MojangPlayer;
import org.mapstruct.Mapper;

@Mapper
public abstract class BedwarsAchievementsMapper {
    public BedwarsAchievementsDTO toDto(BedwarsAchievements bedwarsAchievements) {
        BedwarsAchievementsDTO dto = new BedwarsAchievementsDTO();
        dto.setPlayerUuid(bedwarsAchievements.getPlayerUuid());

        // Fetch and assign userName
        ObjectMapper objectMapper = new ObjectMapper();
        MojangPlayer mojangPlayer = new MojangPlayer();
        if (!bedwarsAchievements.getPlayerUuid().startsWith("00000000")) {
            try {
                mojangPlayer = objectMapper.readValue(new URL("https://sessionserver.mojang.com/session/minecraft/profile/"
                        + bedwarsAchievements.getPlayerUuid()), MojangPlayer.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        dto.setUserName(mojangPlayer.getName());

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
