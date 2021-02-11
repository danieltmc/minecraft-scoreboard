package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.Collection;
//import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.SurvivalGames;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurvivalGamesRepository extends CrudRepository<SurvivalGames, String> {
    //List<SurvivalGames> findAll();

    @Query(value = "SELECT * FROM sgnew_", nativeQuery = true)
    Collection<SurvivalGames> findAll();

    //List<SurvivalGames> findAllByOrderByCoinsDesc();

    @Query(value = "SELECT * FROM sgnew_ ORDER BY Coins DESC", nativeQuery = true)
    Collection<SurvivalGames> findAllByOrderByCoinsDesc();

    //List<SurvivalGames> findAllByOrderByKillsDesc();

    @Query(value = "SELECT * FROM sgnew_ ORDER BY Kills DESC", nativeQuery = true)
    Collection<SurvivalGames> findAllByOrderByKillsDesc();

    //List<SurvivalGames> findAllByOrderByDeathsDesc();
    
    @Query(value = "SELECT * FROM sgnew_ ORDER BY Deaths DESC", nativeQuery = true)
    Collection<SurvivalGames> findAllByOrderByDeathsDesc();

    //List<SurvivalGames> findAllByOrderByWinsDesc();

    @Query(value = "SELECT * FROM sgnew_ ORDER BY Wins DESC", nativeQuery = true)
    Collection<SurvivalGames> findAllByOrderByWinsDesc();

    //List<SurvivalGames> findAllByOrderByGamesPlayedDesc();

    @Query(value = "SELECT * FROM sgnew_ ORDER BY Play_Time DESC", nativeQuery = true)
    Collection<SurvivalGames> findAllByOrderByGamesPlayedDesc();
}
