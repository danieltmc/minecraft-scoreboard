package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsStats;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedwarsStatsRepository extends CrudRepository<BedwarsStats, String> {
    @Query(value = "SELECT * FROM mbedwars_player_stats", nativeQuery = true)
    List<BedwarsStats> findAll();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = ?1", nativeQuery = true)
    List<BedwarsStats> findByKeyOrderByValueDesc(String key);

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:beds_destroyed' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByBedsDestroyedOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:cache_rank' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByCacheRankOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:deaths' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByDeathsOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:final_kills' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByFinalKillsOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:kd' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByKDOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:kills' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByKillsOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:loses' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByLossesOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:play_time' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByPlayTimeOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:rank' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByRankOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:rounds_played' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByRoundsPlayedOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:wins' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByWinsOrderByValueDesc();

    @Query(value = "SELECT DISTINCT player_uuid, mbedwars_player_stats.key, value FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = 'bedwars\\:wl' ORDER BY value DESC", nativeQuery = true)
    List<BedwarsStats> findByWLOrderByValueDesc();
}
