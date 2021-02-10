package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.SurvivalGamesDTO;

public interface SurvivalGamesService {
    List<SurvivalGamesDTO> getAll();

    List<SurvivalGamesDTO> getAllOrderByCoins();

    List<SurvivalGamesDTO> getAllOrderByKills();

    List<SurvivalGamesDTO> getAllOrderByDeaths();

    List<SurvivalGamesDTO> getAllOrderByWins();

    List<SurvivalGamesDTO> getAllOrderByGamesPlayed();
}
