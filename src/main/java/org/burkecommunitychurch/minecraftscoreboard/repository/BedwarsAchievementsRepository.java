package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsAchievements;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedwarsAchievementsRepository extends CrudRepository<BedwarsAchievements, String> {
    @Query(value = "SELECT * FROM mbedwars_player_achievements", nativeQuery = true)
    List<BedwarsAchievements> findAll();
}
