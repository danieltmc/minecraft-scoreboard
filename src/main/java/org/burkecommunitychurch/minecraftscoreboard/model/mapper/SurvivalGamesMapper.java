package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.SurvivalGamesDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.SurvivalGames;

public abstract class SurvivalGamesMapper {
    public SurvivalGamesDTO toDto(SurvivalGames survivalGames) {
        SurvivalGamesDTO dto = new SurvivalGamesDTO();
        dto.setPlayerUuid(survivalGames.getPlayerUuid());
        dto.setPlayerName(survivalGames.getPlayerName());
        dto.setCoins(survivalGames.getCoins());
        dto.setKills(survivalGames.getKills());
        dto.setDeaths(survivalGames.getDeaths());
        dto.setWins(survivalGames.getWins());
        dto.setGamesPlayed(survivalGames.getGamesPlayed());
        dto.setModifier(survivalGames.getModifier());
        dto.setPlayTime(survivalGames.getPlayTime());
        dto.setKits(survivalGames.getKits());
        dto.setExp(survivalGames.getExp());
        return dto;
    }
}