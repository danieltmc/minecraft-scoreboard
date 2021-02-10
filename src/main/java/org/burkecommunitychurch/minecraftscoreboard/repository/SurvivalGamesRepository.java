package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.SurvivalGames;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurvivalGamesRepository extends CrudRepository<SurvivalGames, String> {
    List<SurvivalGames> findAll();

    List<SurvivalGames> findAllByOrderByCoinsDesc();

    List<SurvivalGames> findAllByOrderByKillsDesc();

    List<SurvivalGames> findAllByOrderByDeathsDesc();

    List<SurvivalGames> findAllByOrderByWinsDesc();

    List<SurvivalGames> findAllByOrderByGamesPlayedDesc();
}
