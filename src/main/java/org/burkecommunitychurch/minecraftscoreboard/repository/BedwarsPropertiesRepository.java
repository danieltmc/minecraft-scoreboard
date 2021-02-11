package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.Collection;
//import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsProperties;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedwarsPropertiesRepository extends CrudRepository<BedwarsProperties, String> {
    //List<BedwarsProperties> findAll();

    @Query(value = "SELECT * FROM mbedwars_player_properties", nativeQuery = true)
    Collection<BedwarsProperties> findAll();

    //List<BedwarsProperties> findByIdOrderByValueDesc(String id);

    @Query(value = "SELECT * FROM mbedwars_player_properties ORDER BY value DESC", nativeQuery = true)
    Collection<BedwarsProperties> findByIdOrderByValueDesc(String id);
}
