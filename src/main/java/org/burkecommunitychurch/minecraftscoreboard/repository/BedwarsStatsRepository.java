package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.Collection;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsStats;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedwarsStatsRepository extends CrudRepository<BedwarsStats, String> {
    @Query(value = "SELECT * FROM mbedwars_player_stats", nativeQuery = true)
    Collection<BedwarsStats> findAll();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = ?1", nativeQuery = true)
    Collection<BedwarsStats> findByKeyOrderByValueDesc(String key);

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:beds_destroyed' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByBedsDestroyedOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:cache_rank' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByCacheRankOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:deaths' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByDeathsOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:final_kills' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByFinalKillsOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:kd' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByKDOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:kills' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByKillsOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:loses' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByLossesOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:play_time' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByPlayTimeOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:rank' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByRankOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:rounds_played' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByRoundsPlayedOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:wins' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByWinsOrderByValueDesc();

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:wl' ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsStats> findByWLOrderByValueDesc();
}
