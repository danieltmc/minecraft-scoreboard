package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.Collection;
//import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsStats;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedwarsStatsRepository extends CrudRepository<BedwarsStats, String> {
    //List<BedwarsStats> findAll();

    @Query(value = "SELECT * FROM mbedwars_player_stats", nativeQuery = true)
    Collection<BedwarsStats> findAll();

    //List<BedwarsStats> findByKeyOrderByValueDesc(String key);

    @Query(value = "SELECT * FROM mbedwars_player_stats WHERE mbedwars_player_stats.key = ?1", nativeQuery = true)
    Collection<BedwarsStats> findByKeyOrderByValueDesc(String key);
}
