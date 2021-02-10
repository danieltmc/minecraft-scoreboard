package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.TowerDefense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TowerDefenseRepository extends CrudRepository<TowerDefense, String> {
    List<TowerDefense> findAll();
}
