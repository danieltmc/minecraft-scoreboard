package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.Collection;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.PartyGames;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyGamesRepository extends CrudRepository<PartyGames, String> {
    @Query(value = "SELECT * FROM PartyGames_new", nativeQuery = true)
    Collection<PartyGames> findAll();
}
