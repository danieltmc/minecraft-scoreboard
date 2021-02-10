package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

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
}
