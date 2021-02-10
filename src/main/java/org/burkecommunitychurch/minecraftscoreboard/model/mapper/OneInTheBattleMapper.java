package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.OneInTheBattleDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.OneInTheBattle;

public abstract class OneInTheBattleMapper {
    public OneInTheBattleDTO toDto(OneInTheBattle oneInTheBattle) {
        OneInTheBattleDTO dto = new OneInTheBattleDTO();
        dto.setPlayerUuid(oneInTheBattle.getPlayerUuid());
        dto.setPlayerName(oneInTheBattle.getPlayerName());
        dto.setStats(oneInTheBattle.getStats());
        dto.setLoadout(oneInTheBattle.getLoadout());
        dto.setInventory(oneInTheBattle.getInventory());
        return dto;
    }
}
