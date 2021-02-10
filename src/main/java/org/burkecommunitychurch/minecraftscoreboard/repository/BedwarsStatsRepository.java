package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsStats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedwarsStatsRepository extends CrudRepository<BedwarsStats, String> {
    List<BedwarsStats> findAll();
    
    List<BedwarsStats> findDistinctByPlayerUuid();

    List<BedwarsStats> findByKeyOrderByValueAsc();
}
