package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.Collection;
import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.PartiesParties;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartiesPartiesRepository extends CrudRepository<PartiesParties, String> {
    //List<PartiesParties> findAll();

    @Query(value = "SELECT * FROM parties_parties", nativeQuery = true)
    Collection<PartiesParties> findAll();

    //List<PartiesParties> findAllByOrderByKillsDesc();

    @Query(value = "SELECT * FROM parties_parties ORDER BY kills DESC", nativeQuery = true)
    Collection<PartiesParties> findAllByOrderByKillsDesc();

    //List<PartiesParties> findAllByOrderByExperienceDesc();

    @Query(value = "SELECT * FROM parties_parties ORDER BY experience DESC", nativeQuery = true)
    Collection<PartiesParties> findAllByOrderByExperienceDesc();
}
