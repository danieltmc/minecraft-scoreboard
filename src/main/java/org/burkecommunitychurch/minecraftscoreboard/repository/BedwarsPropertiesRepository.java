package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedwarsPropertiesRepository extends CrudRepository<BedwarsProperties, String> {
    List<BedwarsProperties> findAll();
    
    List<BedwarsProperties> findDistinctByPlayerUuid();

    List<BedwarsProperties> findByIdOrderByValueDesc(String id);
}
