package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.PartyGamesDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.PartyGames;

public abstract class PartyGamesMapper {
    public PartyGamesDTO toDto(PartyGames partyGames) {
        PartyGamesDTO dto = new PartyGamesDTO();
        dto.setPlayerUuid(partyGames.getPlayerUuid());
        dto.setPlayerName(partyGames.getPlayerName());
        dto.setData(partyGames.getData());
        return dto;
    }
}
