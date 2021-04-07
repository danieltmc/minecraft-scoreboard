package org.burkecommunitychurch.minecraftscoreboard.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.TheWalls;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface TheWallsRepository extends CrudRepository<TheWalls, String> {
    @Query(value = "SELECT * FROM TheWalls", nativeQuery = true)
    List<TheWalls> findAll();
}
