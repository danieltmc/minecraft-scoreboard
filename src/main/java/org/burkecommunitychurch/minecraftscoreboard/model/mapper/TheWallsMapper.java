package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.TheWallsDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.TheWalls;
import org.mapstruct.Mapper;

@Mapper
public class TheWallsMapper {
    public TheWallsDTO toDto(TheWalls entity) {
        TheWallsDTO dto = new TheWallsDTO();
        dto.setPlayerUuid(entity.getPlayerUuid());
        dto.setPlayerName(entity.getPlayerName());
        dto.setStats(entity.getStats());
        dto.setInventory(entity.getInventory());
        dto.setSelected(entity.getSelected());
        return dto;
    }

    public List<TheWallsDTO> toDtoList(List<TheWalls> list) {
        return list.stream().map(td ->
            toDto(td))
            .collect(Collectors.toList());
    }

    public List<TheWallsDTO> toDtoList(Collection<TheWalls> list) {
        return list.stream().map(td ->
            toDto(td))
            .collect(Collectors.toList());
    }
}
