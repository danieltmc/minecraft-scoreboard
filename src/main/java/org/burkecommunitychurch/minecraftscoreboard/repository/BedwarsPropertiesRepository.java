package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.Collection;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsProperties;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedwarsPropertiesRepository extends CrudRepository<BedwarsProperties, String> {
    @Query(value = "SELECT * FROM mbedwars_player_properties", nativeQuery = true)
    Collection<BedwarsProperties> findAll();

    @Query(value = "SELECT * FROM mbedwars_player_properties ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsProperties> findByIdOrderByValueDesc(String id);
}
