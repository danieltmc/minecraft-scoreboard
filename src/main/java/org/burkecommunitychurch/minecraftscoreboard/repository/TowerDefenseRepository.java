package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.Collection;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.TowerDefense;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TowerDefenseRepository extends CrudRepository<TowerDefense, String> {
    @Query(value = "SELECT * FROM TowerDefense", nativeQuery = true)
    Collection<TowerDefense> findAll();
}
