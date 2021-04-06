package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.SurvivalGames;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurvivalGamesRepository extends CrudRepository<SurvivalGames, String> {
    @Query(value = "SELECT * FROM sgnew_", nativeQuery = true)
    List<SurvivalGames> findAll();

    @Query(value = "SELECT * FROM sgnew_ ORDER BY Coins DESC", nativeQuery = true)
    List<SurvivalGames> findAllByOrderByCoinsDesc();

    @Query(value = "SELECT * FROM sgnew_ ORDER BY Kills DESC", nativeQuery = true)
    List<SurvivalGames> findAllByOrderByKillsDesc();

    @Query(value = "SELECT * FROM sgnew_ ORDER BY Deaths DESC", nativeQuery = true)
    List<SurvivalGames> findAllByOrderByDeathsDesc();

    @Query(value = "SELECT * FROM sgnew_ ORDER BY Wins DESC", nativeQuery = true)
    List<SurvivalGames> findAllByOrderByWinsDesc();

    @Query(value = "SELECT * FROM sgnew_ ORDER BY Play_Time DESC", nativeQuery = true)
    List<SurvivalGames> findAllByOrderByGamesPlayedDesc();
}
