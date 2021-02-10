package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<PartyGamesDTO> toDtoList(List<PartyGames> list) {
        return list.stream().map(pg ->
            toDto(pg))
            .collect(Collectors.toList());
    }
}
