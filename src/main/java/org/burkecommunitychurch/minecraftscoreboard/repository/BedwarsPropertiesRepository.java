package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsProperties;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedwarsPropertiesRepository extends CrudRepository<BedwarsProperties, String> {
    @Query(value = "SELECT * FROM mbedwars_player_properties", nativeQuery = true)
    List<BedwarsProperties> findAll();

    @Query(value = "SELECT * FROM mbedwars_player_properties ORDER BY value DESC", nativeQuery = true)
    List<BedwarsProperties> findByIdOrderByValueDesc(String id);
}
