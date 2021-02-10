package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.OneInTheBattle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneInTheBattleRepository extends CrudRepository<OneInTheBattle, String> {
    List<OneInTheBattle> findAll();
}
