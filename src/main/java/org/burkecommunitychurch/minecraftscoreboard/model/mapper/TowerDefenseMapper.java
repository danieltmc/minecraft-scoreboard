package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.TowerDefenseDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.TowerDefense;

public abstract class TowerDefenseMapper {
    public TowerDefenseDTO toDto(TowerDefense towerDefense) {
        TowerDefenseDTO dto = new TowerDefenseDTO();
        dto.setPlayerUuid(towerDefense.getPlayerUuid());
        dto.setPlayerName(towerDefense.getPlayerName());
        dto.setData(towerDefense.getData());
        return dto;
    }

    public List<TowerDefenseDTO> toDtoList(List<TowerDefense> list) {
        return list.stream().map(td ->
            toDto(td))
            .collect(Collectors.toList());
    }

    public List<TowerDefenseDTO> toDtoList(Collection<TowerDefense> list) {
        return list.stream().map(td ->
            toDto(td))
            .collect(Collectors.toList());
    }
}
