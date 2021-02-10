package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.PartiesParties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartiesPartiesRepository extends CrudRepository<PartiesParties, String> {
    List<PartiesParties> findAll();

    List<PartiesParties> findAllOrderByKillsDesc();

    List<PartiesParties> findAllOrderByExperienceDesc();
    
    List<PartiesParties> findDistinctByName();

    List<PartiesParties> findByNameOrderByKillsDesc(String name);

    List<PartiesParties> findByNameOrderByExperienceDesc(String name);
}